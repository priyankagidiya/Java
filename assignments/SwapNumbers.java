package assignments;

import java.util.Scanner;



public class SwapNumbers {

	public static void main(String[] args) {
		int a , b ;
		System.out.println("Enter two numbers to Swap:");
		Scanner n = new Scanner(System.in);
		a = n.nextInt();
		b = n.nextInt();
		n.close();
		System.out.println("Entered number is: " +a +"," +b);
		System.out.println("After Swapping: ");
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of two numbers is:" +a +"," +b);
		
		

	}

}
