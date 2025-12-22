package bankingSystem;

public class BankAccount {

	String accountHolder;
	double initialAmount;
	
	public BankAccount(String accountHolder, Double initialAmount) {
		this.accountHolder = accountHolder;
		this.initialAmount = initialAmount;
	}
	
	public void withdraw(double amount) {
		if(initialAmount >= amount)
			initialAmount -=amount;
		else
			System.out.println("Your account dont have enough money\n");
	}
	
	public void deposite(double amount) {
		initialAmount = initialAmount + amount;
	}
	
	public void checkBalance() {
		System.out.println("Your balance is "+initialAmount+"\n");
	}
}
