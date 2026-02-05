package inheritance.practice.transport;

class Bus extends Transport {
    int busNo;

    Bus(String city, int busNo) {
        super(city);
        this.busNo = busNo;
    }

    void showBus() {
        showTransport();
        System.out.println("Bus No: " + busNo);
    }
}
