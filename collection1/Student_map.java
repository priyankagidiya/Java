package collection1;

public class Student_map {
	private String Name;
	private int Sem;
	
	public Student_map(String Name,int sem) {
		this.Name = Name;
		this.Sem = Sem;
	}

	@Override
	public String toString() {
		return "Key [Name=" + Name + ", Sem=" + Sem + "]";
	}
	
	
	

}
