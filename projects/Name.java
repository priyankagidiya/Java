package projects;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		
		Scanner name = new Scanner(System.in);
		System.out.print("Enter your Name: ");
		
		String userName = name.nextLine();
		System.out.print("Entered Name is: " +userName);
		
		name.close();

	}

}
