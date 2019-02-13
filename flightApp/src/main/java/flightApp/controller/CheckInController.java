package flightApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import flightApp.CheckInInfo;
import flightApp.data.service.BaggageService;
import flightApp.data.service.DestinationService;
import flightApp.model.Baggage;
import flightApp.model.Destination;

public class CheckInController {

	@Autowired
	BaggageService baggageService;

	@Autowired
	DestinationService DestinationService;
	
	
	@RequestMapping( method = RequestMethod.POST , value = "/checkIn")

	public Boolean checkIn(@RequestBody CheckInInfo checkInInfo) {
		List<Baggage> baggages = baggageService.getBaggages();
		boolean baggageExist = false;
		for (Baggage baggage : baggages) {
			if (checkInInfo.getBaggageId().equals(baggage.baggageId)) {
				baggageExist = true;
				break;
			}
		}

		List<Destination> destinations = DestinationService.getDestinations();

		boolean destinationExist = false;
		for (Destination destination : destinations) {
			if (checkInInfo.getDestinationId() == destination.getDestinationId()) {
				destinationExist = true;
			}
		}
		if (destinationExist && baggageExist) {
			return true;
		}

		return false;
	}

}
