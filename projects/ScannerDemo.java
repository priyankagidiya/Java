package projects;
import java.util.*;           // import java.util.scanner; scanner for input data

public class ScannerDemo {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first number:  ");
		int a = sc.nextInt();
		
		System.out.printf("Entered number is: \t  %d \n", a);
		 
		System.out.print("Enter the second number:  ");
		int b = sc.nextInt();
		
		int c = a + b;
		System.out.print("Sum of two numbers is:\t  "  +c);
		
		sc.close();
	}

}
