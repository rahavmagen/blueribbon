package flightApp.model;

public class Destination {

	int destinationId;
	String destinationName;
	
	public Destination(int destinationId, String destinationName) {
		super();
		this.destinationId = destinationId;
		this.destinationName = destinationName;
	}
	public int getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(int destinationId) {
		this.destinationId = destinationId;
	}
	public String getDestinationName() {
		return destinationName;
	}
	public void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}
	
}
