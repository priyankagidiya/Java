package hackathon_exam;

import java.util.Scanner;

/*Write a program which inputs a positive natural number N and prints the
 *  possible consecutive number combinations, which when added give N.
 *   INPUT: N = 9 OUTPUT: 4 + 5 2 + 3+ 4 */
 
public class Consecutiveno {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		num = input.nextInt();
		for (int i = 1; i < num; i++) {
			StringBuffer sb = new StringBuffer();
			int sum = i;
			sb.append(i).append("  ");
			for (int j = i + 1; sum < num; j++) {
				sb.append(j).append("  ");
				sum = sum + j;
				if (sum == num) {
				System.out.println(sb.toString());
				}
			}
		}
				input.close();
	
	}
}
		
		

	


