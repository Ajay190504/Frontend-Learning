package constructors.practice;

class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accNo) {
        accountNumber = accNo;
        balance = 0.0;
    }

    BankAccount(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101);
        BankAccount b2 = new BankAccount(102, 5000);
        System.out.println(b1.balance);
        System.out.println(b2.balance);
    }
}
