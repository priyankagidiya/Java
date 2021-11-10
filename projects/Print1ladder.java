package projects;

public class Print1ladder {

	public static void main(String[] args) {
		for(int irow=5; irow>=1; irow--) {
			for(int icol=1; icol<=irow; icol++) {
				System.out.print( icol);
			}
			System.out.println();

	}

	}

}
