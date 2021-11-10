package hackathon_exam;
/*Given a string print the reverse of the string.
 * (Input: Java Code Output: edoC avaJ) */
 
import java.util.Scanner;

public class Revstring {

	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		s = sc.nextLine();
		System.out.print("After reverse string is:" );
		for(int i=s.length();i>0;i--) {
			System.out.print(s.charAt(i-1));
		}
		sc.close();

	}

}
