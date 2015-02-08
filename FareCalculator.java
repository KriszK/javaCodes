package bookingExample;

import java.util.Date;

public class FareCalculator {
	int length;
	int bookingClass;
	Date flightDate;
	
	public FareCalculator(int length, int bookingClass, Date flightDate) {

		this.length = length;
		this.bookingClass = bookingClass;
		this.flightDate = flightDate;
	}
	
	public int calculatePrice(){
		int price = 0;
		int days = calculateDays(flightDate);
		
		
		if(length <= 2000){
			price += 300;
		} else if (length > 2000 && length <= 8000){
			price += 500;
		} else {
			price += 700;
		}
		
		if(bookingClass == 1){
			price *= 1.5;
		}
		
		if(days <= 30){
			price *= 1.2;
		}
				
		return price;
	}
	
	private int calculateDays(Date flightDate){
		Date bookinDate = new Date();
		
		return (int)( (flightDate.getTime() - bookinDate.getTime()) / (1000 * 60 * 60 * 24));
	}
	


	
	
}
