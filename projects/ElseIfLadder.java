package projects;

import java.util.Scanner;

public class ElseIfLadder {

	public static void main(String[] args) {
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter the Marks : ");
		int marks = mark.nextInt();
		System.out.println("Entered Marks is: " +marks);
		if(marks<50) {
			System.out.println("Fail");
		}
		else if(marks>=50 && marks<60) {
			System.out.println("Pass");
		}
		else if(marks>=60 && marks<70) {
			System.out.println("Second Class");
		}
		else if(marks>=70 && marks<80) {
			System.out.println("First Class");
		}
		else if(marks>=80 && marks<90) {
			System.out.println("First Class with Distinction");
		}
		else if(marks>=90 && marks<=100) {
			System.out.println("Rank");
		}
		else
			System.out.println("Invalid");
		
		 mark.close();
	}
      
}
