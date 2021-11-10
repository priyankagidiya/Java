package banking;


//Child class
public class CurrentAccount extends Account {
	int extracharges = 1/10;
	
	
	
	void WithdrawAmount() {
		
		int withdraw_amt;
		System.out.println("Enter amount to Withdraw: ");
		withdraw_amt = b.nextInt();
		
		if(withdraw_amt<Balance) {
			
			System.out.println("You can withdraw" );
			Balance = Balance - withdraw_amt-(withdraw_amt*1/10);
			System.out.println("Remaining Balance is after 10% extra charges: " +Balance );
		}
		else {
			System.out.println("Withdraw amount is more than Balance " );
		}
			
		
		
		
	}
	
	

}
