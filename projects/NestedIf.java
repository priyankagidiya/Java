package projects;

public class NestedIf {

	public static void main(String[] args) {
		int age = 30;
		String gender = "Male";
		String citizenship = "India";
		if(age>21) {
			if(gender=="Male")
				System.out.println("The person is an adult male");
			else
				System.out.println("The person is an adult but not male");
			if(citizenship=="India")
				System.out.println("The person also has voting rights");
				else		
				System.out.println("The person do not have voting rights");
		}
		System.out.println("out of outer if construct");

	}

}
