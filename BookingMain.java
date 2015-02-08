package bookingExample;

import java.text.ParseException;

public class BookingMain {
	public static void main(String[] args) throws ParseException {
		Passanger p1 = new Passanger("Susy");
		
		//Booking b1 = new Booking(p1, f1);
		
		BookingPortal bookingPortal = new BookingPortal();
		bookingPortal.enterBookingPortal(p1);
	}
}
