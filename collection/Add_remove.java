package collection;
//Implement user defined Arraylist(implement only add & remove methods.
import java.util.ArrayList;
import java.util.Iterator;

public class Add_remove {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<Object>();
		list.add("Paul");
		list.add(34);
		list.add(45);
		list.add("Pam");
		list.add(50);
		//System.out.println("Original list: " + list);
		System.out.println();
		Iterator<Object> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//list.remove(itr);
		list.remove(0);
		list.remove(1);
		list.remove(2);
		System.out.println("After removing:" +list);
		}
	}


