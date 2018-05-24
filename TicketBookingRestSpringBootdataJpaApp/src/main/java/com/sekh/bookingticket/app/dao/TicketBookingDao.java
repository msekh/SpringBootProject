package com.sekh.bookingticket.app.dao;

import org.springframework.data.repository.CrudRepository;


import com.sekh.bookingticket.app.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer> {
}
