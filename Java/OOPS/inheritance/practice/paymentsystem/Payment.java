package inheritance.practice.paymentsystem;

class Payment {
    int amount;

    Payment(int amount) {
        this.amount = amount;
    }

    void showAmount() {
        System.out.println("Amount: " + amount);
    }
}