package org.chementsova.mvc_department_service.dto;

import lombok.*;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TicketDto {

    private int id;

    private String ticketType;

    private String ticketClass;

    private Date startDate;

    private double price;

    public TicketDto(String ticketType, String ticketClass, Date startDate, double price) {
        this.ticketType = ticketType;
        this.ticketClass = ticketClass;
        this.startDate = startDate;
        this.price = price;
    }
}