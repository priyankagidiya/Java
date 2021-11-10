package projects;
import java.util.Scanner;

public class ForLoop1 {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.print("Enter your number upto 5 digit : " );
		int n = number.nextInt();
		int sum = 0;
		
		 for(int i=1;i<=n;i++);
		 sum = n*(n+1)/2;
		 
		 System.out.println("The sum of numbers is : " +sum);
		
		 number.close();
	}
		
}
