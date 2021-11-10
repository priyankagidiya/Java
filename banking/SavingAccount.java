package banking;
//Child class
public class SavingAccount extends Account{
	
	void WithdrawAmount1() {
		
		int withdraw_amt;
		System.out.println("Enter amount to Withdraw: ");
		withdraw_amt = b.nextInt();
		
		if(withdraw_amt<Balance) {
			
			System.out.println("You can withdraw" );
			Balance = Balance - withdraw_amt;
			System.out.println("Remaining balance is: " +Balance);
		}
		else {
			System.out.println("Withdraw amount is more than Balance " );
		}
			
		
		
		
		
	}

}
