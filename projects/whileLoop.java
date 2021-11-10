package projects;

public class whileLoop {

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while(i<=30) {
			sum = sum +i;
			i = i+2;
			
		}
		System.out.println("Sum of odd numbers is : " +sum);

	}

}
