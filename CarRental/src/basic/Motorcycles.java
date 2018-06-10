package basic;

public class Motorcycles extends Cars {
	enum type {sport, cross, chopper}

	public Motorcycles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Motorcycles(String registrationNumber, String vinNumber, String color, double price, double fuelLevel,
			double combustion, double mileageCounter, Engine engine) {
		super(registrationNumber, vinNumber, color, price, fuelLevel, combustion, mileageCounter, engine);
		
	};
	
}
