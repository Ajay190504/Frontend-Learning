package polymorphism.overloadding;

public class MethodOverload1 {

    // 1) 
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // 2) 
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // 3) 
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public int max(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 4) 
    public String concat(String a, String b) {
        return a + b;
    }

    public String concat(String a, String b, String c) {
        return a + b + c;
    }

    // 5) 
    public double area(int side) {
        return side * side;
    }

    public double area(int l, int b) {
        return l * b;
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        MethodOverload1 c = new MethodOverload1();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(2.5, 3.5));
        System.out.println(c.add(1, 2, 3));

        System.out.println(c.multiply(2, 3));
        System.out.println(c.multiply(2.5, 3.5));
        System.out.println(c.multiply(2, 3, 4));

        System.out.println(c.max(10, 20));
        System.out.println(c.max(2.2, 5.5));
        System.out.println(c.max(1, 9, 4));

        System.out.println(c.concat("Java", "Rocks"));
        System.out.println(c.concat("Ajay", " is ", "Awesome"));

        System.out.println(c.area(5));
        System.out.println(c.area(4, 6));
        System.out.println(c.area(3.0));
    }
}
