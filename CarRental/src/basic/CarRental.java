package basic;

public class CarRental {

	public static void main(String[] args) {
			Sedans Audi = new Sedans ("KTT-1020","123244", "Blue", 1.34, 100, 2, 10000, new PetrolEngine(), 4);
			System.out.println("Fuel Level: " + Audi.getFuelLevel());
			System.out.println("Miles counter: " + Audi.getMileageCounter());
			
			System.out.println("Drive.....");
			Audi.refuel(1000);
			Audi.drive(100); 
			
			System.out.println("Fuel Level: " + Audi.getFuelLevel());
			System.out.println("Miles counter: " + Audi.getMileageCounter());
	}	

}
