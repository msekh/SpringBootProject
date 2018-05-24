package com.sekh.bookingticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sekh.bookingticket.app.dao.TicketBookingDao;
import com.sekh.bookingticket.app.entities.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDao ticketBookingDao;

	public Ticket createTicket(Ticket ticket) {

		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {

		return ticketBookingDao.findOne(ticketId);
	}

	public Iterable<Ticket> getAllTicketsBooked() {

		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.delete(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findOne(ticketId);
		ticketFromDb.setEmail(newEmail);
		Ticket ticketUpdate = ticketBookingDao.save(ticketFromDb);

		return ticketUpdate;
	}

}
