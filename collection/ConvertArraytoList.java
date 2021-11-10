package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*Convert Array content to List content.
Convert List content to Array.
Sort Array list
Compare two lists for equality i.e to check Equal or NotEqual*/

public class ConvertArraytoList {

	public static void main(String[] args) {
		//convert an Array to List.
		String array[] = {"Convert", "Array", "to","List"};
		System.out.println("Original Array: "+Arrays.toString(array));
		List<String> list = new ArrayList<>();
		Collections.addAll(list, array);
		System.out.println("List: " +list);
		//convert list to Array.
		List<String> li = new LinkedList<String>();
		li.add("Convert");
		li.add("List");
		li.add("to");
		li.add("Array");
		System.out.println("Original List: " +li);
		String [] arr1 = li.toArray(new String[0]);
		for(String s : arr1) {
			System.out.println (s );
		}
		if(list.equals(li))
			System.out.println("Equal");
		else
			System.out.println("Notequal");
		
	}

	}


