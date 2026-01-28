package constructors.practice;

class Mobile {
    String model;
    int batteryCapacity;

    Mobile(String model, int batteryCapacity) {
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile("Samsung", 5000);
        System.out.println(m.model + " " + m.batteryCapacity);
    }
}