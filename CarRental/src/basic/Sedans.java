package basic;

public class Sedans extends Cars {
	
		int doorsNumber=4;
		
		public Sedans(String registrationNumber, String vinNumber, String color, double price, double fuelLevel,
				double combustion, double mileageCounter, Engine engine, int doorsNumber) {
			super(registrationNumber, vinNumber, color, price, fuelLevel, combustion, mileageCounter, engine);
			this.doorsNumber = doorsNumber;
		};
		
		
		

	


}
