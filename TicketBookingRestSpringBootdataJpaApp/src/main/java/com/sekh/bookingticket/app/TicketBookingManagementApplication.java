package com.sekh.bookingticket.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketBookingManagementApplication  {
  
	public static void main(String[] args) {
		//ConfigurableApplicationContext context=SpringApplication.run(TicketBookingManagementApplication.class, args);
		SpringApplication.run(TicketBookingManagementApplication.class, args);
	//TicketBookingService ticketBookingService=context.getBean("ticketBookingService", TicketBookingService.class );
	
	}

	
}
