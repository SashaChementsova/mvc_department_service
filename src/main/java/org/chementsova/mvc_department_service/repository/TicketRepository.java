package org.chementsova.mvc_department_service.repository;

import org.chementsova.mvc_department_service.model.Ticket;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
