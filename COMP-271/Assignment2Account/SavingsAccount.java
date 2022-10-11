public class SavingsAccount extends Account {
	
	public SavingsAccount() {
		super();
	}

	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Savings account overdrawn transtaction rejected");
	}
}