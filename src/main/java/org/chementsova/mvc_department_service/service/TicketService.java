package org.chementsova.mvc_department_service.service;

import org.chementsova.mvc_department_service.dto.TicketDto;
import org.chementsova.mvc_department_service.model.Ticket;
import java.util.List;

public interface TicketService {
    void save(TicketDto ticketDto);

    List<TicketDto> getAll();

    TicketDto getById(int id);

    void initialize();
}
