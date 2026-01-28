package constructors.practice;

class FlightTicket {
    double totalPrice;

    FlightTicket(double baseFare) {
        double tax = baseFare * 0.18;
        totalPrice = baseFare + tax;
    }

    public static void main(String[] args) {
        FlightTicket t = new FlightTicket(5000);
        System.out.println("Total = " + t.totalPrice);
    }
}
