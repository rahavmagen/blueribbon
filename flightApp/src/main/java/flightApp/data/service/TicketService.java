package flightApp.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flightApp.data.TicketRepository;
import flightApp.model.Ticket;

@Service
public class TicketService {

	TicketRepository ticketRepository;
	
	@Autowired
	TicketService ticketService;
	
	public List<Ticket> getTickets(){
		
		ticketRepository = new TicketRepository();
		return ticketRepository.getTickets();

	}
	
	
}
