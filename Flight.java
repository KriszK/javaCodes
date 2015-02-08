package bookingExample;

import java.util.Date;

public class Flight {
	private Date flightDate;
	private String departure;
	private String arrival;
	private int length;
	private int availablePlaces;
	
	public Flight(Date date, String departure, String arrival, int length) {
		this.flightDate = date;
		this.departure = departure;
		this.arrival = arrival;
		this.length = length;
		this.availablePlaces = 100;
	}
	
	public void reduceAvailablePlaces(){
		availablePlaces--;
		System.out.println("Available places: " + availablePlaces);
	}
	
	public String toString(){
		return "Departure: " + departure + " \tArrival: " + arrival + "     \t" + flightDate;
	}

	public int getLength() {
		return length;
	}

	public Date getFlightDate() {
		return flightDate;
	}
	
	
	
	
	
	
	
}
