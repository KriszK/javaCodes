package bookingExample;

public class Passanger {
	private String name;
	
	public Passanger(String name) {
		this.name = name;
	}
	

	
	public String getName() {
		return name;
	}



	public void payForTicket(){
		System.out.println(name + " payed for a ticket");
	}
	public void checkIn(){
		System.out.println(name + " checked in");
	}
	
}
