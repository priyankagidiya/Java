package collection;


import java.util.ArrayList;
import java.util.Collections;



/*Wjp to Store 5 student objects into ArrayList ( name, id, age ).
	and sort ascending order of name.*/
public class Sort_ascendingorder {
	 

	public static void main(String args[]) {
		
		ArrayList<Student> a = new ArrayList<Student>();
		a.add(new Student("Abc", 1 , 15));
		a.add(new Student("Xyz", 2 , 16));
		a.add(new Student("Def", 3 , 15));
		a.add(new Student("Klm", 4 , 17));
		a.add(new Student("Pqr", 5 , 16));
		
		System.out.println("Student name Sorting ");
		
		Collections.sort(a,Student.StuNameComparator);
		for(Student str:a) {
			System.out.println(str);
		}
			

	}

}
