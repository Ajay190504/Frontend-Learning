package inheritance.practice.railwaysystem;

class RailwaySystem {
    String systemName;

    RailwaySystem(String systemName) {
        this.systemName = systemName;
    }

    void showSystem() {
        System.out.println("System: " + systemName);
    }
}