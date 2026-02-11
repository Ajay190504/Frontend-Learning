package polymorphism.overriding;

public class Main {

    
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void subtract(int a, int b) {
        System.out.println("Difference: " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("Product: " + (a * b));
    }

    public void divide(int a, int b) {
        System.out.println("Quotient: " + (a / b));
    }

   
    public void greet(String name) {
        System.out.println("Hello " + name);
    }

    public void printChars(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
    }

    public void concat(String a, String b) {
        System.out.println(a + b);
    }

    public void countChars(String text) {
        int count = 0;
        for (char c : text.toCharArray()) {
            count++;
        }
        System.out.println("Characters: " + count);
    }

   
    public void login() {
        System.out.println("User logging in...");
    }

    public void logout() {
        System.out.println("User logging out...");
    }

    public void openApp(String app) {
        System.out.println("Opening " + app);
    }

    public void closeApp(String app) {
        System.out.println("Closing " + app);
    }

    
    public void isEven(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    public void max(int a, int b) {
        if (a > b)
            System.out.println("Max: " + a);
        else
            System.out.println("Max: " + b);
    }

    public void min(int a, int b) {
        if (a < b)
            System.out.println("Min: " + a);
        else
            System.out.println("Min: " + b);
    }

    public void abs(int n) {
        if (n < 0)
            System.out.println("Absolute: " + (-n));
        else
            System.out.println("Absolute: " + n);
    }

   
    public void showDate() {
        System.out.println("Showing date...");
    }

    public void showTime() {
        System.out.println("Showing time...");
    }

    public void printLine() {
        System.out.println("----------------------------");
    }

    public void about() {
        System.out.println("Main class basic behavior");
    }
}
