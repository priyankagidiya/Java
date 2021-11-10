package hackathon_exam;

import java.util.Scanner;

//WJP to differentiate input as string, int or bool
public class Differentiate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("please enter an input"); 
		if(sc.hasNextInt()){ 
		System.out.println("Entered input is integer"); 
		} 
		else if(sc.hasNextBoolean()) { 
			
			System.out.println("Entered input is Boolean"); 
			} 
		else if(sc.hasNextLine()){ 
		
		System.out.println("Entered input is String"); 
		}
		
		
		sc.close();
		}

	}


