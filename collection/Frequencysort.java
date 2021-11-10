package collection;
/*Implement user defined Array List (Implement only add and remove methods)
Use frequency sort on the following 4 5 2 1 4 5 6 3 4 3 1 4 5 4 6,
Note: Output should appear like : 4 4 4 4 4 5 5 5 1 1 3 3 6 6 2*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Frequencysort {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int input;
			
			System.out.println("Enter number of elements: " );
			input = sc.nextInt();
			int[] arr = new int[input];
			
		
			System.out.println("Enter " +input+ " Elements");
			for(int i = 0; i< input; i++) {
			arr[i] = sc.nextInt();	
			}
	
	

	
	
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		
		System.out.println("Input array: "+Arrays.toString(arr) );
		
		List<Integer> output = new ArrayList<>();
		
		for(Integer entry:arr) {
			int frequency = map.getOrDefault(entry, 0);
			map.put(entry, frequency+1);
			output.add(entry);
		}
		Collections.sort(output, new Comparator<Integer>(){

		

			@Override
			public int compare(Integer o1, Integer o2) {
				int freqcomp = map.get(o2).compareTo(map.get(o1));
				int valuecomp = o2.compareTo(o2);
				if(freqcomp == 0)
					return valuecomp;
				else
					return freqcomp;
			}
		});
		
		System.out.println("Frequency sorted elements: ");
		System.out.print("[ "); 
		for(Integer in : output) {
			System.out.print(in + " ");
		}
		System.out.println("] ");
		sc.close();
		
		
			 
			
		
		
		
	}
	
		
		

	
		}

	


