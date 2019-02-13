package flightApp.model;

public class Baggage {
	
	public String baggageId;
	String passengerName;
	
	public Baggage(String baggageId, String passengerName) {
		super();
		this.baggageId = baggageId;
		this.passengerName = passengerName;
	}
	public String getBaggageId() {
		return baggageId;
	}
	public void setBaggageId(String baggageId) {
		this.baggageId = baggageId;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

}
