package hackathon_exam;


import java.util.Scanner;

// Given an array of integers check the Palindrome of the series. 
public class Palindromeseries {

	public static void main(String[] args) {
		String s="",num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		num = sc.nextLine();
		
		int length = num.length();
		for ( int i = length - 1; i >= 0; i-- )  
	         s = s + num.charAt(i);  
	      if (num.equals(s))  
	         System.out.println("Entered number is a palindrome.");  
	      else  
	         System.out.println("Entered number isn't a palindrome.");
		
			
		sc.close();

	}

}
