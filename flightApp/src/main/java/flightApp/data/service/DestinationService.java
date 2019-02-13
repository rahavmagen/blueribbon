package flightApp.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import flightApp.data.DestinationRepository;
import flightApp.model.Destination;

public class DestinationService {

	
	@Autowired
	DestinationService DestinationService;
	
	public List<Destination> getDestinations(){
		
		DestinationRepository destinationRepository = new DestinationRepository();
		return destinationRepository.getDestinations();

	}
	
	
}
