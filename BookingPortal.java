package bookingExample;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookingPortal {
	private List<Booking> bookingList;
	private AirlinePortal airlinePortal;
	
	
	
	
	public BookingPortal() throws ParseException {
		bookingList = new ArrayList<Booking>();
		airlinePortal = new AirlinePortal();
	}




	public void enterBookingPortal(Passanger p){
		System.out.println(p.getName() + " entered the bookingportal.\n");
		
		airlinePortal.listFlightsAndFares();
		System.out.println("Choose a flight id");
		
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		
		System.out.println("\nChoose a class (1/2)");
		int classId = sc.nextInt();
		
		FareCalculator fareCalculator = new FareCalculator(airlinePortal.getFlightList().get(id-1).getLength(), 
															classId, 
															airlinePortal.getFlightList().get(id-1).getFlightDate());
		
		int price = fareCalculator.calculatePrice();
		System.out.println("The price: " + price);
		
		
		
		
	}
	
	
}
