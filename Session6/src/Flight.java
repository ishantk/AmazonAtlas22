
public class Flight {
	
	String company;
	String fromLocation;
	String toLocation;
	double duration;
	int price;
	
	public Flight() {
		this("NA", "NA", "NA", 0, 0);
	}

	public Flight(String company, String fromLocation, String toLocation, double duration, int price) {
		this.company = company;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.duration = duration;
		this.price = price;
	}

	void showFlight() {
		System.out.println("------------------------------------");
		System.out.println(company);
		System.out.println("Duration: "+duration+" hrs");
		System.out.println("\u20b9 "+price);
		System.out.println("From: "+fromLocation+" To: "+toLocation);
		System.out.println("------------------------------------");
		System.out.println();
	}
	
}
