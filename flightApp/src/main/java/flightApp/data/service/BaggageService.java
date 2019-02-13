package flightApp.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import flightApp.data.BaggageRepository;
import flightApp.model.Baggage;

@Service
public class BaggageService {

	BaggageRepository baggageRepository;
	
	@Autowired
	BaggageService baggageService;
	
	public List<Baggage> getBaggages(){
		
		baggageRepository = new BaggageRepository();
		return baggageRepository.getBaggages();

	}
	
}
