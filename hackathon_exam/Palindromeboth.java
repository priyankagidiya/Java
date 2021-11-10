package hackathon_exam;

import java.util.Scanner;

//Write a program to check palindrome (MalayalaM) for both numbers and string?
public class Palindromeboth {

	public static void main(String[] args) {
		
		String s="",num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number/string:");
		num = sc.nextLine();
		
		int length = num.length();
		for ( int i = length - 1; i >= 0; i-- )  
	         s = s + num.charAt(i);  
	      if (num.equals(s))  
	         System.out.println("Entered string/number is a palindrome.");  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
		sc.close();
		

	}

}
