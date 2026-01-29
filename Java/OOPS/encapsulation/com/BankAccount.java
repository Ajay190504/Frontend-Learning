package encapsulation.com;

public class BankAccount {
	private double balance=1000;
	
	void deposite(double amount) {
		this.balance+=amount;
	}
	
	void withdraw(double amount) {
		this.balance-=amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
