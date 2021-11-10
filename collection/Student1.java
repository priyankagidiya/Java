package collection;
/*WJP to Create student class with name, grade and totalmarks attributes.
 *  Store 5 student information. sort student objects according to totalmarks.*/ 
import java.util.Comparator;

public class Student1 implements Comparator <Student1>{

	public int compareTo(Student1 s) {
					return 0;
		
	}
	 private String Name;
	  private int grade;
	  private int totalmarks;

	public Student1( String Name, int grade, int totalmarks ) {
	        
	        this.Name = Name;
	        this.grade = grade;
	        this.totalmarks = totalmarks;
	    }
	  public static Comparator<Student1> Stutotalmarkscomparator = new Comparator<Student1>() {
		//Static class sortByMark implements Comparator<Student1>{
			public int compare(Student1 s, Student1 s1) {
				//return s.totalmarks.compareTo(s1);
				if(s.totalmarks==s1.totalmarks)
					return 0;
				else if(s.totalmarks>s1.totalmarks)
					return 1;
				else
					return -1;

			   //int totalmarks1 = s.gettotalmarks();
			   //int totalmarks2 = s1.gettotalmarks();

			   /*For ascending order*/
			  // return totalmarks1-totalmarks2;
				
			}};
			public String toString() {
				return Name +" "+ grade +" "+ totalmarks;
			}

	protected int gettotalmarks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compare(Student1 o1, Student1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
