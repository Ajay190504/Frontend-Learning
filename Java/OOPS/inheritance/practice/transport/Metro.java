package inheritance.practice.transport;

class Metro extends Transport {
    String line;

    Metro(String city, String line) {
        super(city);
        this.line = line;
    }

    void showMetro() {
        showTransport();
        System.out.println("Metro Line: " + line);
    }
}