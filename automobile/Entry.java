package automobile;



public class Entry {
	
	
	
	public static void main(String[] args) {
		//Vehicle v = new Vehicle;// cannot create instance of parent class,it will show compilation error
		try {
			Vehicle mycar = new Car();
			Vehicle mybike = new Bike();
			Car c = new Car();
			Bike b = new Bike();
			mycar.NoofWheels();
			mycar.Start();
			c.TurningRadius();
			mybike.NoofWheels();
			mybike.Start();
			b.MaxSpeed();
			start(mycar);
			start(mybike);
			
		}
		catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}
	}
	public static void start(Vehicle v) {
		
		v = (Car)v;
		System.out.println("Car can Ignite Using key");
	
		
	
	}
}

	
		
		
		/*Car c = new Car();
		Vehicle v = new Car();
		
		 Bike b = new Bike();
		c.NoofWheels();
		c.TurningRadius();
		//c.start;
		
		
		
		
		Car c1 = new Car();
		c1.start=(new Car());
		Vehicle c2 = (Car)c1;
		Bike b1 = new Bike();
		Vehicle c3 = (Bike)b1;
		b1.start=(new Bike());
		
		
		b.NoofWheels();
		b.MaxSpeed();
		b.Start();
		
		
		
		//Integer Bike = new Integer(5);
		
		try {
			
			throw new Exception("e.errorMessage");
			

	}catch(Exception e ) {
		
		
		
		System.out.println("Exception throw in Bike "+ e.getMessage());
		
	}
		
}
}*/


