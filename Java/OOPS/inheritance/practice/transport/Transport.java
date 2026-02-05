package inheritance.practice.transport;

class Transport {
    String city;

    Transport(String city) {
        this.city = city;
    }

    void showTransport() {
        System.out.println("City: " + city);
    }
}
