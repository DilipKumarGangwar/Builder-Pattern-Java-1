
public class Car {
	
	String name;       //required parameter
	String color;      //required parameter
	String engineType; //required parameter
	boolean isGPS;     //optional parameter
	boolean isMusicSystem; //optional parameter
	
	//Builder Class (inner class)
	public static class CarBuilder {
		
		String name;
		String color;
		String engineType;
		boolean isGPS;
		boolean isMusicSystem;
		
		//Initializing  the required fields
		public CarBuilder(String name, String color,String engineType) {
			this.name=name;
			this.color=color;
			this.engineType=engineType;
		}
			
		//Setting Optional fields
			
			public CarBuilder setName(String name) {
				this.name = name;
				return this;
			}
		
			public CarBuilder setColor(String color) {
				this.color = color;
				return this;
			}
		
			
			public CarBuilder setEngineType(String engineType) {
				this.engineType = engineType;
				return this;
			}
		
			public CarBuilder setGPS(boolean isGPS) {
				this.isGPS = isGPS;
				return this;
			}
		
			public CarBuilder setMusicSystem(boolean isMusicSystem) {
				this.isMusicSystem = isMusicSystem;
				return this;
			}
			
			public Car buildCar() {
				return new Car(this);
			}
			
	  }  //end of Builder class
	
	  private Car(CarBuilder c) {    //Check constructor  is private
		this.name=c.name;
		this.color=c.color;
		this.engineType=c.engineType;
		this.isGPS=c.isGPS;
		this.isMusicSystem=c.isMusicSystem;
	  }
	   public String getName() {
			return name;
		}
		public String getColor() {
			return color;
		}
		public String getEngineType() {
			return engineType;
		}
		public boolean isGPS() {
			return isGPS;
		}
		public boolean isMusicSystem() {
			return isMusicSystem;
		}
	
}
