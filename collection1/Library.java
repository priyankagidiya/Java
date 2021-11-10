package collection1;

public class Library {
	private int Libnum;
	private int Totalbooks;
	
	public Library(int Libnum,int Totalbooks) {
		this.Libnum = Libnum;
		this.Totalbooks = Totalbooks;
	}

	@Override
	public String toString() {
		return "Value [Libnum=" + Libnum + ", Totalbooks=" + Totalbooks + "]";
	}
	

}
