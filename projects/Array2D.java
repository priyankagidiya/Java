package projects;

public class Array2D {

	public static void main(String[] args) {
		int a[][]= {{10,11,12},{13,14,15}};
		int b[][]= {{11,12,13},{14,15,16}};
		//int c[][]= new int[2][3];
		int i,j;
		System.out.println("Array-A");
		for( i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Array-B");
		for( i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Sum of the two arrays A & B is Array-C");
		for( i=0;i<2;i++) {
			for(j=0;j<3;j++) {
			
				System.out.print(a[i][j]+b[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

	}

}
