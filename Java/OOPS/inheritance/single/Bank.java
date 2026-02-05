package inheritance.single;

public class Bank {
	int accNo=0;
	double balance;
	void createBankAccount(double amt) {
		this.accNo++;
		System.out.println("Account "+this.accNo+" created successfully with balance "+this.balance);
	}
	
	void withdraw(double amt) {
		if(amt>this.balance) {
			System.out.println("Balance is low, deposit money or withdraw less amt");
		}
		else if(amt<=0) {
			System.out.println("Amount can't be negative or 0");
		}
		else {
			this.balance=this.balance-amt;
			System.out.println("Amount "+amt+" withdrawl successful");
		}
	}
	
	void deposit(double amt) {
		if(amt<=0) {
			System.out.println("Can't deposit negative or 0 amt");
		}
		else {
			this.balance+=amt;
		}
	}
}
