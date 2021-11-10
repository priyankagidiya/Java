package hackathon_exam;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/*Given an array prints the unique numbers and also print the
 *  number of occurrences of duplicate numbers.*/
 
public class Occurenceofduplicate{

	public static void main(String[] args) {
		
		int i,temp;
		int[] arr = new int[10];
		int[] count = new int[256];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter upto 10 integer value: ");
		for(i = 0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		System.out.println("Entered array is:"+Arrays.toString(arr));
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		
				for( i=0; i <arr.length ;i++) 
		{
					hm.put(arr[i], i);
		}
				System.out.println("Unique numbers are: "+hm.keySet());
				
				System.out.println("Duplicate numbers are: ");
				
				for(i =0;i<arr.length;i++) {
					temp = arr[i];
					count[i]=temp++;
				}
				for(i=1;i<count.length;i++) {
					
					if(count[i]>=2) {
						System.out.printf("%d occurs %d times\n", i,count[i]);
					}
				}
				sc.close();
				}}
			
		
	

	


