package bookingExample;

public class Booking {
	private Passanger passanger;
	private AirlinePortal airlinePortal;
		
	public Booking(Passanger passanger, AirlinePortal airlinePortal) {
		this.passanger = passanger;
		this.airlinePortal = airlinePortal;
	}
	
	
	

	private void askForPaying(){
		passanger.payForTicket();
	}
	
	private void setPlacesInFlight(Flight f){
		f.reduceAvailablePlaces();

	}
	
	
}
