package bookingExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AirlinePortal {
	
	List<Flight> flightList;
	
	public AirlinePortal() throws ParseException{
		flightList = new ArrayList<Flight>();
		initFlightList();
	}
	
	
	
	public List<Flight> getFlightList() {
		return flightList;
	}



	private void initFlightList() throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm");
		String dateInString = "31-03-2015 10:20";
		Date date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "Budapest", "London", 1504));
		
		dateInString = "04-03-2015 16:00";
		date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "Budapest", "Frankfurt", 830));
		
		dateInString = "01-04-2015 05:10";
		date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "London", "New York", 5045));
		
		dateInString = "04-03-2015 22:15";
		date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "Frankfurt", "Tokyo", 8150));
		
		dateInString = "07-03-2015 16:00";
		date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "Tokyo", "Sidney", 7824));
		
		dateInString = "07-03-2015 16:00";
		date = sdf.parse(dateInString);
		flightList.add(new Flight(date, "Budapest", "Stockholm", 1410));
		
		
	}
	
	public void listFlightsAndFares(){
		int id = 1;
		for(Flight f : flightList){
			System.out.println((id++) + " " + f);
		}
		
	}
}
