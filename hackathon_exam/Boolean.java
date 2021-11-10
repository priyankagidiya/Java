package hackathon_exam;
/*Consider there is a 3 Boolean variable called a, b, c.
 *  Check if at least two out of three Booleans are true */
 
import java.util.Scanner;

public class Boolean {

	public static void main(String[] args) {
		boolean a;
		boolean b;
		boolean c;
		boolean result;

				
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st boolean value:");
		a = s.nextBoolean();
		System.out.println("Enter 2nd boolean value:");
		b = s.nextBoolean();
		System.out.println("Enter 3rd boolean value:");
		c = s.nextBoolean();
		
	if(a) {
			result = b || c;

	
	}else
		result = b || c;


	if(result) {
		System.out.println("Two boolean variables are true");
	}else {
		System.out.println("Two boolean variables are not true ");
	}
	s.close();
}
}

	
	
