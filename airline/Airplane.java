package airline;

public class Airplane {

	public static void main(String[] args) {
		Boeing b = new Boeing();
		Airbus a = new Airbus();
		
		b.takeoff();
		b.takedown();
		a.takeoff();
		a.takedown();
	}	

}
