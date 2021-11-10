package hackathon_exam;

import java.util.Scanner;

/*WJP to find total number of integers, uppercase and lowercase 
 * character in the give string */
 
public class Find_int {

	public static void main(String[] args) {
		String str;
		int digit=0,upper=0,lower=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String: ");
		//s.useDelimiter(" ");
		str = s.nextLine();
		
		
		for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				upper++;
				
			}else if(ch>='a' && ch<='z') {
				lower++;
			}else if(ch>='0' && ch<='9') {
				digit++;
			}
				
		}
		System.out.println("Upper case letters: "+upper);
		System.out.println("Lower case letters: "+lower);
		System.out.println("Integers are: "+digit);
		
		s.close();

	}

}
