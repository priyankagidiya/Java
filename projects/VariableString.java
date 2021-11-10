package projects;

public class VariableString {

	public static void main(String[] args) {
		String custName = "Priyanka Jain";
		String itemDesc = "Dress";
		String message;
		
		int quantity = 2;
		double price = 19.99;
		double tax = 1.1;
		double total;
		
		 message = custName + " wants to purchase a " + quantity + " " + itemDesc + " at " + price + "each";
	
		
		System.out.println(message);
		
		total = quantity * price * tax;
		System.out.println("Priyanka's total with tax is: " + total);

	}

}
