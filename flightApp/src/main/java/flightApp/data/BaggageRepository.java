package flightApp.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import flightApp.model.Baggage;

@Repository
public class BaggageRepository {

	List<Baggage> baggages = new ArrayList<Baggage>();
	
	public BaggageRepository () { 
		
		Baggage baggageRahav = new Baggage("RM111", "Rahav Magen");
		Baggage baggageIdo = new Baggage("Ido222", "Ido");
		baggages.add(baggageIdo);
		baggages.add(baggageRahav);
		
	}

	public List<Baggage> getBaggages() {
		return baggages;
	}
	
}
