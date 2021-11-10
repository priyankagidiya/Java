package hackathon_exam;
import java.util.Arrays;
import java.util.Scanner;
//WJP to perform ascending order Selection sort
public class Selection_sort {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter upto 10 numbers: ");
		for(int i = 0;i<arr.length;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Entered array is: "+Arrays.toString(arr));
		Selection_sort ob = new Selection_sort();
		ob.selectionSort(arr);
		ob.display(arr);
		s.close();
		}
	  void selectionSort(int arr[]) 
	    { 
	        int pos;
	        int temp;
	        for (int i = 0; i < arr.length; i++) {
	            pos = i; 
	            for (int j = i+1; j < arr.length; j++) {
	                if (arr[j] < arr[pos])  {                //find the index of the minimum element
	                pos = j;
	                } }
	            temp = arr[pos];            //swap the current element with the minimum element
	            arr[pos] = arr[i]; 
	            arr[i] = temp; 
	        } 
	    } 
	  
	    void display(int arr[])                     //display the array
	    { 
	        for (int i=0; i<arr.length; i++) 
	        {
	            System.out.print(arr[i]+" ");
	        }  
	    } }
	  


