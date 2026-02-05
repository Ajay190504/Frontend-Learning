package inheritance.practice.telecom;

class Jio extends TelecomService {
    String network;

    Jio(String name, String network) {
        super(name);
        this.network = network;
    }

    void display() {
        show();
        System.out.println("Network: " + network);
    }

    public static void main(String[] args) {
        Jio j = new Jio("Telecom Service", "5G");
        j.display();
    }
}
