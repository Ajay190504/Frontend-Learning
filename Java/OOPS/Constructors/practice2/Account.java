package constructors.practice2;

class Account {
    double balance;

    // Default constructor
    Account() {
        balance = 1000;
    }

    // Parameterized constructor
    Account(double balance) {
        this.balance = balance;
    }

    void display() {
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(2500);

        a1.display();
        a2.display();
    }
}
