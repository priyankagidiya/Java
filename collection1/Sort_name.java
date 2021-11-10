package collection1;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//import java.util.stream.Collectors;





public class Sort_name {
	
	
	

	public static <T> void main(String[] args) {
		ArrayList<Student1> a = new ArrayList<Student1>();
		a.add(new Student1("Abi", 689));
		a.add(new Student1("Nht", 908));
		a.add(new Student1("Ghr", 5789));
		a.add(new Student1("Zyx", 87));
		a.add(new Student1("Pri", 68));
		System.out.println("Student name Sorting ");
		
		Collections.sort(a,Student1.StuNameComparator);
		
		for(Student1 str:a) {
			System.out.println(str);
		}
		

	}



	

}
