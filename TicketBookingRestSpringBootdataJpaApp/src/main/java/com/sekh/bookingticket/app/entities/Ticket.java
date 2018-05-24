package com.sekh.bookingticket.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
// @SequenceGenerator(name="ticket_id", initialValue=1,
// allocationSize=10,sequenceName="TICKET_ID")
public class Ticket {
	@Id
	@Column(name = "ticket_id")
	//@SequenceGenerator(name = "", sequenceName = "")
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ticket_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer ticketId;

	@Column(name = "passenger_name", nullable = false)
	private String passengerName;

	@Column(name = "booking_date")
	private Date bookingDate;

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "dest_station")
	private String destStation;

	@Column(name = "email")
	private String email;

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public Integer getTicketId() {
		return ticketId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestStation() {
		return destStation;
	}

	public void setDestStation(String destStation) {
		this.destStation = destStation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", passengerName=" + passengerName + ", bookingDate=" + bookingDate
				+ ", sourceStation=" + sourceStation + ", destStation=" + destStation + ", email=" + email + "]";
	}

}
