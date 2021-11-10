package collection1;

import java.util.Comparator;



/*Create student class with name(String type) and regno (int type) attributes.
use any collection to Store 5 student information, sort using student name*/
public class Student1 implements Comparable<Student1>  {
	
	private String Name;
	private int Regno;
	
	public Student1(String Name,int Regno) {
		this.Name = Name;
		this.Regno = Regno;
	}
	public String getName() {
		return Name;
	}

	
	public static Comparator<Student1> StuNameComparator = new Comparator<Student1>() {
			
	public int compare(Student1 s, Student1 s1) {
		 String Name1 = s.getName().toUpperCase();
		 String Name2 = s1.getName().toUpperCase();

		   //ascending order
		   return Name1.compareTo(Name2);
		
	
	}};
	public String toString() {
		return Name +" "+ Regno;
	}

	@Override
	public int compareTo(Student1 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	

	

}
