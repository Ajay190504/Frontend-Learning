package constructors.practice;

class Laptop {
    String brand;
    int ram;
    double price;

    Laptop(String brand) {
        this.brand = brand;
    }

    Laptop(String brand, int ram, double price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public static void main(String[] args) {
        Laptop l1 = new Laptop("HP");
        Laptop l2 = new Laptop("Dell", 16, 75000);
        System.out.println(l1.brand);
        System.out.println(l2.brand + " " + l2.ram + " " + l2.price);
    }
}
