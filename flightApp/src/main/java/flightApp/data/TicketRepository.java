package flightApp.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import flightApp.model.Destination;
import flightApp.model.Ticket;

@Repository
public class TicketRepository {
	
	private final List <Ticket> tickets = new ArrayList<Ticket>();

	public TicketRepository()
	{
		Destination lasVegasDest = new Destination(111 , "Las Vegas");
		Destination newYorkDest = new Destination(222 , "New York");
		Ticket lasVegasTicket = new Ticket();
		lasVegasTicket.setTicketId(1);
		lasVegasTicket.setDestination(lasVegasDest);
		tickets.add(lasVegasTicket);
		
		Ticket newYorkTicket = new Ticket();
		newYorkTicket.setDestination(newYorkDest);
		newYorkTicket.setTicketId(2);
		tickets.add(newYorkTicket);
		
	}

	public List<Ticket> getTickets() {
		return tickets;
	}
	
	
}
