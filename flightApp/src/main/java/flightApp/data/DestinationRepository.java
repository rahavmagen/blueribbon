package flightApp.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import flightApp.model.Destination;

@Repository
public class DestinationRepository {

	


	List<Destination> destinations = new ArrayList<Destination>();
	
	public DestinationRepository () {
		
		Destination lasVegasdest = new Destination(111, "Las Vages");
		destinations.add(lasVegasdest);
		
		Destination newYorkDest = new Destination(222, "New York");
		destinations.add(newYorkDest);
		
	}

	public List<Destination> getDestinations() {
		return destinations;
	}

	
}
