package org.chementsova.mvc_department_service.dto.mapping.utils;

import org.chementsova.mvc_department_service.dto.TicketDto;
import org.chementsova.mvc_department_service.model.Ticket;
import org.chementsova.mvc_department_service.model.TicketClass;
import org.chementsova.mvc_department_service.model.TicketType;
import org.springframework.stereotype.Service;

@Service
public class TicketMapper {

    public static TicketDto toTicketDto(Ticket ticket) {
        TicketDto dto = new TicketDto();
        dto.setId(ticket.getId());
        dto.setTicketClass(ticket.getTicketClass().getValue());
        dto.setTicketType(ticket.getTicketType().getValue());
        dto.setPrice(ticket.getPrice());
        dto.setStartDate(ticket.getStartDate());

        return dto;
    }

    public static Ticket toTicket(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setId(ticketDto.getId());
        ticket.setTicketClass(TicketClass.valueOf(ticketDto.getTicketClass()));
        ticket.setTicketType(TicketType.valueOf(ticketDto.getTicketType()));
        ticket.setPrice(ticketDto.getPrice());
        ticket.setStartDate(ticketDto.getStartDate());

        return ticket;
    }
}
