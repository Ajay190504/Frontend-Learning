package constructors.practice;


class Vehicle {
    String type;
    int wheels;

    Vehicle() {
        this("Bike", 2);
    }

    Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        System.out.println(v.type + " " + v.wheels);
    }
}
