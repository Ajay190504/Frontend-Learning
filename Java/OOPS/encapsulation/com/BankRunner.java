package encapsulation.com;

public class BankRunner {
	
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		
		System.out.println("Balance: "+b1.getBalance());
		b1.deposite(200000);
		System.out.println("Balance: "+b1.getBalance());
		b1.withdraw(10000);
		System.out.println("Balance: "+b1.getBalance());
		b1.withdraw(100000);
		System.out.println("Balance: "+b1.getBalance());
		b1.deposite(1200);
		System.out.println("Balance: "+b1.getBalance());
	}
}
