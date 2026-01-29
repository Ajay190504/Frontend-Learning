package constructors.nonparameterized;

public class OpenBankAcc{
    String name;
    public OpenBankAcc() {
        this.name = "Ajay";
        System.out.println("Congratulations! "+this.name+" Your Bank Account is opened.");
    }
    
    public static void main(String[] args) {
        OpenBankAcc oba = new OpenBankAcc();
        System.out.println("Your Name: "+oba.name);

    }
}
