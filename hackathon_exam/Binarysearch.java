package hackathon_exam;

import java.util.Arrays;
import java.util.Scanner;

/*Write a program for binary search. And 5 i/p has to take from user 
as binary elements. */
public class Binarysearch {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int st;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter input: ");
		for(int i = 0;i<10;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("Entered array is:"+Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("After sorting: "+Arrays.toString(arr));
		System.out.println("Enter which number to be found: ");
		 st = s.nextInt();
		System.out.println(st +" Found at index "+Arrays.binarySearch(arr,st));
		s.close();

	}

}
