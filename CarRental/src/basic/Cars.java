package basic;

public class Cars {
	

	private String registrationNumber; 
	private String vinNumber;
	private String color; 
	private double price; 
	private double fuelLevel; 
	private double combustion;
	private double mileageCounter; 
	private Engine engine;
	
	
	
	
	public Cars(String registrationNumber, String vinNumber, String color, double price, double fuelLevel,
			double combustion, double mileageCounter, Engine engine) {
		super();
		this.registrationNumber = registrationNumber;
		this.vinNumber = vinNumber;
		this.color = color;
		this.price = price;
		this.fuelLevel = fuelLevel;
		this.combustion = combustion;
		this.mileageCounter = mileageCounter;
		this.engine = engine;
	}
	
	public Cars() {
    }
	
	
	public String getVinNumber() {
		return vinNumber;
	}


	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getFuelLevel() {
		return fuelLevel;
	}


	public void setFuelLevel(double fuelLevel) {
		this.fuelLevel = fuelLevel;
	}


	public double getMileageCounter() {
		return mileageCounter;
	}


	public void setMileageCounter(double mileageCounter) {
		this.mileageCounter = mileageCounter;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}


	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	
	public void drive(double kilometers) {
        engine.drive(); 
        this.mileageCounter += kilometers; 
        fuelLevel -= combustion * kilometers;
   
	}
        
        public void refuel(double fuel) {
        this.fuelLevel += fuel;
    }
    
    
    
    
}
