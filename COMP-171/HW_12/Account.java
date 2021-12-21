import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;
	Account() {
		id = 0;
		balance = 0;
		annualInterestRate = 0;
		dateCreated = new Date(); 
	}
	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
		dateCreated = new Date();
	}
	public void Id(int newId) {
		id = newId;
	}
	public void Balance(double newBalance) {
		balance = newBalance;
	}
	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}
	public int Id() {
		return id;
	}
	public double Balance() {
		return balance;
	}
	public double AnnualInterestRate() {
		return annualInterestRate;
	}
	public String DateCreated() {
		return dateCreated.toString();
	}
	public double MonthlyInterestRate() {
		return annualInterestRate / 12;
	}
	public double MonthlyInterest() {
		return balance * (MonthlyInterestRate() / 100);
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit(double amount) {
		balance += amount;
	}
}

