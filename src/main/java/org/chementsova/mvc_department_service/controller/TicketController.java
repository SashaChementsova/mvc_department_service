package org.chementsova.mvc_department_service.controller;

import org.chementsova.mvc_department_service.dto.TicketDto;
import org.chementsova.mvc_department_service.service.TicketService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/get/all")
    public List<TicketDto> getTickets() {
        return ticketService.getAll();
    }

    @GetMapping("/get/{id}")
    public TicketDto getTickets(@PathVariable int id) {
        return ticketService.getById(id);
    }

}
