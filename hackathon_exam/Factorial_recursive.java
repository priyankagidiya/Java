package hackathon_exam;

import java.util.Scanner;

//WJP to find factorial of a number using recursion.
public class Factorial_recursive {

	public static void main(String[] args) {
		int n, f = 1;
		System.out.println("Enter your number to calculate Factorial: " );
		Scanner fn= new Scanner(System.in);
		n=fn.nextInt();
		//System.out.println("The value entered is: ");
		f = factorial(n);
		  System.out.println("Factorial of "+n+" is: "+f);   
		fn.close();
		
		}
	static int factorial(int n){    
		  if (n == 0)    
		    return 1;    
		  else    
		    return(n * factorial(n-1));    
		 }    

}
