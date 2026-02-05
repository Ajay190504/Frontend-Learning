package inheritance.practice.railwaysystem;

class Passenger extends RailwaySystem {
    String name;

    Passenger(String systemName, String name) {
        super(systemName);
        this.name = name;
    }

    void showPassenger() {
        showSystem();
        System.out.println("Passenger: " + name);
    }
}