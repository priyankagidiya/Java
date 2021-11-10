package hackathon_exam;

import java.util.Scanner;

//WJP to find factorial of a number using non-recursion.
public class Factorial_nonrecursive {

	public static void main(String[] args) {
		int n, i, f = 1;
		System.out.println("Enter your number to calculate Factorial: " );
		Scanner fn= new Scanner(System.in);
		n=fn.nextInt();
		System.out.println("The value entered is: " + n);
		
		fn.close();
		
			if(n<0)
				System.out.println("Number should be non-negetive");
			else {
				for(i=1;i<=n;i++) 
				f = f*i;
				System.out.println("Factorial of "+n+ " is:"+f);
			}
			
	    
	   

	}

}
