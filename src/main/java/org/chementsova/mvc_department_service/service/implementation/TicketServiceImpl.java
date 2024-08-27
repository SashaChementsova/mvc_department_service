package org.chementsova.mvc_department_service.service.implementation;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.chementsova.mvc_department_service.dto.TicketDto;
import org.chementsova.mvc_department_service.dto.mapping.utils.TicketMapper;
import org.chementsova.mvc_department_service.model.Ticket;
import org.chementsova.mvc_department_service.model.TicketType;
import org.chementsova.mvc_department_service.repository.TicketRepository;
import org.chementsova.mvc_department_service.service.TicketService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;;

    private final File file = new File("D:\\Java Beginners Andersen\\mvc_department_service\\" +
            "src\\main\\resources\\ticketData.txt");

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void save(TicketDto ticketDto) {
        ticketRepository.save(TicketMapper.toTicket(ticketDto));
    }

    @Override
    public List<TicketDto> getAll() {
        List<TicketDto> ticketDtos = new ArrayList<>();
        List<Ticket> tickets = (List<Ticket>) ticketRepository.findAll();
        for (Ticket ticket : tickets) {
            ticketDtos.add(TicketMapper.toTicketDto(ticket));
        }
        return ticketDtos;
    }

    @Override
    public TicketDto getById(int id) {
        return TicketMapper.toTicketDto(ticketRepository.findById(id).get());
    }

    @Override
    public void initialize() {
        try {
            List<TicketDto> ticketDtos = new ObjectMapper().reader()
                    .forType(new TypeReference<List<TicketDto>> () {})
                    .readValue(file);
            for (TicketDto ticketDto : ticketDtos) {
                if(checkPriceField(ticketDto)
                        && checkStartDateField(ticketDto)
                        && checkTicketTypeField(ticketDto)
                        && ticketDto.getTicketClass() != null) {
                    ticketRepository.save(TicketMapper.toTicket(ticketDto));
                }
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private boolean checkPriceField(TicketDto ticketDto) {
        return ticketDto.getPrice() > 0.0;
    }

    private boolean checkStartDateField(TicketDto ticketDto) {
        if (ticketDto.getStartDate() == null || ticketDto.getStartDate().equals("")) {
            return false;
        }
        return compareDates(ticketDto.getStartDate().toLocalDate());
    }

    private boolean checkTicketTypeField(TicketDto ticketDto) {
        return Objects.equals(ticketDto.getTicketType(), TicketType.DAY.getValue())
                || Objects.equals(ticketDto.getTicketType(), TicketType.WEEK.getValue())
                || Objects.equals(ticketDto.getTicketType(), TicketType.MONTH.getValue())
                || Objects.equals(ticketDto.getTicketType(), TicketType.YEAR.getValue());
    }

    public boolean compareDates(LocalDate date) {
        LocalDate date1 = LocalDate.now();

        int diff = date1.compareTo(date);

        return diff >= 0;
    }
}
