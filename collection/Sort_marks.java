package collection;
/*WJP to Create student class with name, grade and totalmarks attributes.
 *  Store 5 student information. sort student objects according to totalmarks.*/ 
 
import java.util.ArrayList;
import java.util.Collections;

public class Sort_marks {

	public static void main(String[] args) {
		ArrayList<Student1> a = new ArrayList<Student1>();
		a.add(new Student1("Abc", 1 , 78));
		a.add(new Student1("Xyz", 2 , 60));
		a.add(new Student1("Def", 3 , 90));
		a.add(new Student1("Klm", 4 , 85));
		a.add(new Student1("Pqr", 5 , 68));
		
	
		
		System.out.println("Sorting total marks ");
		
		Collections.sort(a,Student1.Stutotalmarkscomparator);
		for(Student1 str:a) {
			System.out.println(str);
			
		}
		
		

	}

}
