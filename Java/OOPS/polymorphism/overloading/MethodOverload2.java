package polymorphism.overloadding;

public class MethodOverload2 {

    // 1) 
    public boolean check(int n) {
        return n % 2 == 0;
    }

    public boolean check(double n) {
        return n >= 0;
    }

    public boolean check(String s) {
        return s != null && !s.isEmpty();
    }

    // 2) 
    public int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public int compare(double a, double b) {
        return Double.compare(a, b);
    }

    public int compare(String a, String b) {
        return a.compareTo(b);
    }

    // 3) convert → returns String
    public String convert(int n) {
        return String.valueOf(n);
    }

    public String convert(double n) {
        return String.format("%.2f", n);
    }

    // 4) 
    public String show(int a) {
        return "Int: " + a;
    }

    public String show(double a) {
        return "Double: " + a;
    }

    public String show(String a) {
        return "String: " + a;
    }

    // 5)
    public int length(String s) {
        return s.length();
    }

    public int length(int[] arr) {
        return arr.length;
    }

    public int length(double[] arr) {
        return arr.length;
    }

    public static void main(String[] args) {
        MethodOverload2 u = new MethodOverload2();

        System.out.println(u.check(10));        
        System.out.println(u.check(-5.5));      
        System.out.println(u.check("Java"));    

        System.out.println(u.compare(10, 20)); 
        System.out.println(u.compare(2.5, 1.5));
        System.out.println(u.compare("Ajay", "Java"));

        System.out.println(u.convert(100));
        System.out.println(u.convert(3.14159));

        System.out.println(u.show(10));
        System.out.println(u.show(2.5));
        System.out.println(u.show("Overloading"));

        System.out.println(u.length("Hello"));
        System.out.println(u.length(new int[]{1,2,3,4}));
        System.out.println(u.length(new double[]{1.1,2.2}));
    }
}
