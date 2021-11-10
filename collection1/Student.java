package collection1;



import java.util.HashSet;
import java.util.Iterator;

import java.util.Set;




/*Create student class with name (String type) and regno (int type) attributes.
use any collection to Store 5 student information. (no duplicates).*/
public class Student {
	
	private String Name;
	private int Regno;
	
	private static Object Student(String Name, int Regno) {
		
		return Name + " "+ Regno;
	}

	
	
	
	
	public static void main(String args[]) {
		Set<Object> s = new HashSet<Object>();
		s.add(Student("Abc",2345));
		s.add(Student("Xyz",5643));
		s.add(Student("Bca",1567));
		s.add(Student("Cba",1245));
		s.add(Student("Abc",2345));
		
		
		/*for(Object st:s) {
			System.out.println(st);
		}*/
		Iterator<Object> it = s.iterator();
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}

		
	}

	
	
	
	


	
}
