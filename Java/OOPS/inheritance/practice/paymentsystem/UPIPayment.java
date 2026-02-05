package inheritance.practice.paymentsystem;

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(int amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    void pay() {
        showAmount();
        System.out.println("UPI ID: " + upiId);
        System.out.println("Payment Done");
    }

    public static void main(String[] args) {
        UPIPayment u = new UPIPayment(1000, "ajay@upi");
        u.pay();
    }
}

