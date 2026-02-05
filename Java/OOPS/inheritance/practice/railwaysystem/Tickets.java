package inheritance.practice.railwaysystem;

class Ticket extends RailwaySystem {
    String pnr;

    Ticket(String systemName, String pnr) {
        super(systemName);
        this.pnr = pnr;
    }

    void showTicket() {
        showSystem();
        System.out.println("PNR: " + pnr);
    }
}
