package hackathon_exam;

import java.util.Scanner;

// Write a method that will remove given character from the String? 
public class Removechar {

	public static void main(String[] args) {
		String st;
		int in;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String: ");
		st = s.nextLine();
		System.out.println("Enter which index to be removed");
		in = s.nextInt();
		System.out.println("After Removing:");
		System.out.println(charRemoveAt(st, in));
		
		s.close();

	}

	private static String charRemoveAt(String st, int in) {
		 return st.substring(0,in)+ st.substring(in + 1);  
	}

}
