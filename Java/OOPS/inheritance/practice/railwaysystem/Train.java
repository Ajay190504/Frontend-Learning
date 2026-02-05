package inheritance.practice.railwaysystem;


class Train extends RailwaySystem {
    String trainName;

    Train(String systemName, String trainName) {
        super(systemName);
        this.trainName = trainName;
    }

    void showTrain() {
        showSystem();
        System.out.println("Train: " + trainName);
    }

    public static void main(String[] args) {
        Passenger p = new Passenger("Indian Railways", "Ajay");
        p.showPassenger();

        Ticket t = new Ticket("Indian Railways", "PNR101");
        t.showTicket();

        Train tr = new Train("Indian Railways", "Deccan Queen");
        tr.showTrain();
    }
}