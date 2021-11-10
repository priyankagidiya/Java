package banking;
import java.util.Scanner;
//Parent class
public class Account {
	Scanner b = new Scanner(System.in);
	String Name;
	String Accttype;
	double Balance;
	int Acctno;
	void getdata() {
		System.out.println("Enter name: ");
		Name = b.next();
		System.out.println("Enter Account number: ");
		Acctno = b.nextInt();
		System.out.println("Enter balance: ");
		Balance = b.nextDouble();
		
	}
	void setdata() {
		System.out.println("Name is: "+Name);	
		System.out.println("Account number is: "+Acctno);
		System.out.println("Balance is: " +Balance);
		
	}
	

}
