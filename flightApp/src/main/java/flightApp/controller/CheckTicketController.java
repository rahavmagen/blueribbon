package flightApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import flightApp.data.service.TicketService;
import flightApp.model.Ticket;

@RestController
public class CheckTicketController  {
	
	@Autowired
	TicketService ticketService;
	

	@RequestMapping(value="/checkTicket/{ticketId}"  ,method=RequestMethod.POST )
	public Boolean checkTicket(@PathVariable("ticketId") int ticketId)
	{
		System.out.println("ticket id = "+ticketId);
		List <Ticket> Tickets = ticketService.getTickets();
		for(Ticket ticket : Tickets)
		{
			if(ticketId == ticket.getTicketId())
			{
				return true;
			}
		}
			
		return false;
	}
	
	



}
