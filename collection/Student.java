package collection;
/*Wjp to Store 5 student objects into ArrayList ( name, id, age ).
and sort ascending order of name.*/
import java.util.Comparator;

public class Student implements Comparable<Student> {
	 private String Name;
	  private int id;
	  private int age;

	public Student( String Name, int id, int age) {
	        
	        this.Name = Name;
	        this.id = id;
	        this.age = age;
	    }

	public String getName() {
		return Name;
	}

	
	public static Comparator<Student> StuNameComparator = new Comparator<Student>() {
			
	public int compare(Student s, Student s1) {
		 String Name1 = s.getName().toUpperCase();
		 String Name2 = s1.getName().toUpperCase();

		   //ascending order
		   return Name1.compareTo(Name2);
		
	
	}};
	public String toString() {
		return Name +" "+ id +" "+ age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	

}
