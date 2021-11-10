package hackathon_exam;
/* WJP to find total number of repeated integers, uppercase and lowercase
 *  character in the give string */

import java.util.Scanner;

public class Repeated_intupperlower {

	public static void main(String[] args) {
		 String str;
		 int i;
		
		 
		 int digit = 0 , upper = 0, lower=0, special=0;
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter the string: ");
		// for(i=0;i<str.length();i++) {
		 str = s.nextLine();
		
		 
				 for( i = 0; i<str.length();i++) {
			 char ch = str.charAt(i);
			
			if(ch >='A' && ch<='Z') {
				
				 upper++;
			 }else if(ch>='a' && ch<='z') {
				 lower++;
			 }else if(ch>='0' && ch<='9') {
				 digit++;
			 }else {
				 special++;
			 }
		 }
		/* System.out.println("Upper case letters: "+upper);
		 System.out.println("Lower case letters: "+lower);
		 System.out.println("Integers are: "+digit);*/
				 char[] ch1 = str.toCharArray();
				 System.out.println("Duplicate upper case is:");
				 for(i=0;i<upper;i++) {
						for(int j=i;j<upper;j++) {
							if(ch1[i]==ch1[j]) {
								System.out.print(ch1[j]+" ");
								break;
							}
						}
					}
		 s.close();
				 
	

	}
	
}
