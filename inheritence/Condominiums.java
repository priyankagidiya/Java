package inheritence;

import java.util.Scanner;

public class Condominiums extends Home {

	public static void main(String[] args) {
			System.out.println("Houses can be Condominium, TownHome, SingleFamilyHome, Bunglow, Mansion");
			Scanner s = new Scanner(System.in);
			System.out.println("Please choose which Type you want to see specifications: ");
			 String input = s.nextLine();
			
			 s.close();
		
		Condominiums c = new Condominiums();
		c.doors();
		c.floor();
		c.rooms();
		c.bathrooms();
		

	

	}
}
