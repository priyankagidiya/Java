package hackathon_exam;

import java.util.Arrays;
import java.util.Scanner;

// Given an array of integers, sort the integer values.
public class Sort_int {

	public static void main(String[] args) {
	
			int[] arr = new int[10];
			
			Scanner s = new Scanner(System.in);
			System.out.println("Enter input: ");
			for(int i = 0;i<10;i++) {
				arr[i] = s.nextInt();
			}
			System.out.println("Entered array is:"+Arrays.toString(arr));
			
			Arrays.sort(arr);
			System.out.println("After sorting: "+Arrays.toString(arr));
			s.close();

	}

}
