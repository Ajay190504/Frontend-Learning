package constructors.practice2;

class Car {
    String model;
    double price;

    // Non-parameterized constructor
    Car() {
        System.out.println("Car Started");
    }

    // Parameterized constructor
    Car(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("BMW X5", 7500000);

        c2.display();
    }
}
