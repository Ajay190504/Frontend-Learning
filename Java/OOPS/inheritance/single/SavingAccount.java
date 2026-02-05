package inheritance.single;

public class SavingAccount extends Bank {

	public static void main(String[] args) {
		
		SavingAccount sa1 = new SavingAccount();
		System.out.println("Creating Saving Account");
		sa1.createBankAccount(1000);
		
		System.out.println("Withdrawing money");
		sa1.withdraw(100);
		
		System.out.println("Depositing Money");
		sa1.deposit(300);
		

	}

}
