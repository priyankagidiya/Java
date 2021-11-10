package banking;
import java.util.Scanner;
public class Bank {
	
	static void MakePayment() {
		double Balance;
		int deposit;
		Scanner b = new Scanner(System.in);
		System.out.println("Enter balance: ");
		Balance = b.nextDouble();
		System.out.println("Enter amount to deposit: ");
		deposit = b.nextInt();
		Balance = Balance + deposit;
		System.out.println("Total amount is: " +Balance);
		b.close();
	}
	
	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		CurrentAccount ca = new CurrentAccount();
		SavingAccount sa = new SavingAccount();
		
		
		int ch;
		System.out.println("Enter your choice: ");
		System.out.println("Enter 1 for Current Account details: ");
		System.out.println("Enter 2 for Savings Account details: ");
		ch = b.nextInt();
		 switch(ch)
	        {
	            case 1:
	                    int choice;
	                    ca.getdata();
	            		ca.setdata();
	                    System.out.println("1.Withdraw");
	                    System.out.println("2.Deposite");
	                    System.out.println("enter the choice");
	                    choice=b.nextInt();
	                    switch(choice)
	                    {
	                        case 1:
	                                ca.WithdrawAmount();
	                                break;
	                        case 2:
	                                Bank.MakePayment();
	                                break;
	                        default:
	                        	  System.out.println("wrong choice");
	                                break;
	                    }
	                break;
	            case 2:
	                    int choice1;
	                    sa.getdata();
	            		sa.setdata();
	                    System.out.println("1.Withdraw");
	                    System.out.println("2.Deposite");
	                    System.out.println("enter the choice");
	                    choice1=b.nextInt();
	                    switch(choice1)
	                    {
	                        case 1:
	                        	sa.WithdrawAmount1(); 
	                               
	                                break;
	                        case 2:
	                        	Bank.MakePayment();
	                        	 
	                                break;
	                        default:
	                                System.out.println("wrong choice");
	                                

	}
	        }
		 b.close();


	}
}


