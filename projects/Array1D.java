package projects;
import java.util.Scanner;

public class Array1D {

	public static void main(String[] args) {
		int n,i;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size of an Array:");
		n=s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements of an Array:");
		for(i=0;i<n;i++){
			a[i] = s.nextInt();
			a[i]++;
			s.close();
			}
		System.out.println("Elements of the Array after incrementing by 1:");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			
		}
		
		

	}

}
