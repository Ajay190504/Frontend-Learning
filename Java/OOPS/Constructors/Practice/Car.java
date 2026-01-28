package constructors.practice;

class Car {
    String brand;
    double price;

    Car(String b, double p) {
        brand = b;
        price = p;
    }

    public static void main(String[] args) {
        Car c = new Car("Tata", 850000);
        System.out.println(c.brand + " " + c.price);
    }
}
