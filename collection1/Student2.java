package collection1;
/*Create student class with name(String type) and regno (int type) attributes.
use any collection to Store 5 student information. sort students using
name(only unique student objects should be printed (Ex s1(aa,11) s2(aa,12)
s3(aa,11) s4(bb, 12) then s1(aa,11) s2(aa,12) s4(bb, 12) should be printed.*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class Student2{
	//private String Name;
	//private int Regno;
	
	private static Object Student3(String Name, int Regno) {
		// TODO Auto-generated method stub
		return Name + " " + Regno;
	}
	
	
	
	public static void main(String[] args) {
		List<Object> li = new LinkedList<Object>();
		li.add(Student3("Aa",11));
		li.add(Student3("Aa",12));
		li.add(Student3("Bb",11));
		li.add(Student3("Aa",11));
		li.add(Student3("Cc",12));
		System.out.println("Original Array:"+li);
		
		
		
		

		
		Set<Object> s = new HashSet<Object>(li);
		

		
		
		
		//System.out.println("Original Array" +s );
		
		
		Iterator<Object> itr = s.iterator();
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		
		
	
		
			
		
	}
	
				}

	
		
	

