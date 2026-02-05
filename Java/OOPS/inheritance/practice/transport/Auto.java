package inheritance.practice.transport;

class Auto extends Transport {
    String autoNo;

    Auto(String city, String autoNo) {
        super(city);
        this.autoNo = autoNo;
    }

    void showAuto() {
        showTransport();
        System.out.println("Auto No: " + autoNo);
    }

    public static void main(String[] args) {
        Bus b = new Bus("Pune", 25);
        b.showBus();

        Metro m = new Metro("Delhi", "Red Line");
        m.showMetro();

        Auto a = new Auto("Mumbai", "MH12-1234");
        a.showAuto();
    }
}
