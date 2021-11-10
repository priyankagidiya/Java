package collection;

import java.util.Collections;

import java.util.LinkedList;
import java.util.List;





//WJP to Store 5 integer values in linkedlist and sort in ascending order.
public class Integer_ascendingorder {
	
	public static void main(String[] args) {
	
		
		List<Integer> l2 = new LinkedList<Integer>();
		
		
		l2.add(5);
		l2.add(10);
		l2.add(13);
		l2.add(1);
		l2.add(4);
		
		System.out.println("Original list" +l2);
		//Collections.reverse(l2);
		Collections.sort(l2);

		System.out.println("After sorting: " +l2);
		
		
		
		
		
		
		
		
		
		

	}

}

