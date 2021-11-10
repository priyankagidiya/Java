package hackathon_exam;

import java.util.Scanner;

//WJP to convert string to int .
public class Convert_stringtoint {

	public static void main(String[] args) {
		String input="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter input: ");
		
		input = sc.next();
		
		
		int i = Integer.parseInt(input);
		
		System.out.println("String to int: "+i);
		sc.close();

	}

}
