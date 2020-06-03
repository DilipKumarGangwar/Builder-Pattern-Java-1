
public class CarClient {
	
	public static void main(String args[]) {
		
		Car c1 = new Car.CarBuilder("Maruti 700","Red","I4").buildCar();  //CarBuilder is initialising required attributes
		
		System.out.println("***Printing Car Information(Maruti 700)*** ");
		System.out.println("Car Name:"+c1.getName()+" "+"Color="+c1.getColor()+" "+"Engine="+c1.getEngineType()+" ");
		if(c1.isGPS())
		   System.out.println("GPS is present");
		else 
			System.out.println("GPS is NOT present");
		if(c1.isMusicSystem())
		    System.out.println("Music System is present");
		else 
		 	System.out.println("Music System is NOT present");
		System.out.println();
		
		//CarBuilder is initialising required attributes
		//Setters are setting optional parameters
		Car c2 = new Car.CarBuilder("SUV","Black","V8").setGPS(true).setMusicSystem(true).buildCar(); 
		
		System.out.println("***Printing Car Information(SUV)*** ");
		System.out.println("Car Name:"+c2.getName()+" "+"Color="+c2.getColor()+" "+"Engine="+c2.getEngineType()+" ");
		if(c2.isGPS())
		   System.out.println("GPS is present");
		else 
			System.out.println("GPS is NOT present");
		if(c2.isMusicSystem())
		    System.out.println("Music System is present");
		else 
		 	System.out.println("Music System is NOT present");
		
	}

}
