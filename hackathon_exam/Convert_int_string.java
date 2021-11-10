package hackathon_exam;

import java.util.Scanner;

//WJP to convert int to string 
public class Convert_int_string {

	public static void main(String[] args) {
		int input;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please Enter a integer: ");
		
		input = sc.nextInt();
		
		
		String i = Integer.toString(input);
		
		System.out.println("int to String : "+i);
		sc.close();

	}

}
