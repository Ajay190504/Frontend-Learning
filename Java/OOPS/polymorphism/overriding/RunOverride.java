package polymorphism.overriding;

public class RunOverride extends Main {

   
    @Override
    public void add(int a, int b) {
        System.out.println("Adding " + a + " and " + b + " = " + (a + b));
    }

    @Override
    public void subtract(int a, int b) {
        System.out.println("Subtracting " + b + " from " + a + " = " + (a - b));
    }

    @Override
    public void multiply(int a, int b) {
        System.out.println("Multiplying " + a + " × " + b + " = " + (a * b));
    }

    @Override
    public void divide(int a, int b) {
        System.out.println("Dividing " + a + " ÷ " + b + " = " + (a / b));
    }

    
    @Override
    public void greet(String name) {
        System.out.println("Welcome " + name + "!");
    }

    @Override
    public void printChars(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i) + " ");
        }
        System.out.println();
    }

    @Override
    public void concat(String a, String b) {
        System.out.println(a + " " + b);
    }

    @Override
    public void countChars(String text) {
        int count = 0;
        char[] arr = text.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            count++;
        }
        System.out.println("Total characters: " + count);
    }

   
    @Override
    public void login() {
        System.out.println("Login successful with verification.");
    }

    @Override
    public void logout() {
        System.out.println("Logout completed safely.");
    }

    @Override
    public void openApp(String app) {
        System.out.println("Launching app → " + app);
    }

    @Override
    public void closeApp(String app) {
        System.out.println("App closed → " + app);
    }

    
    @Override
    public void isEven(int n) {
        if (n % 2 == 0)
            System.out.println(n + " is Even Number");
        else
            System.out.println(n + " is Odd Number");
    }

    @Override
    public void max(int a, int b) {
        if (a > b)
            System.out.println("Greater value is: " + a);
        else
            System.out.println("Greater value is: " + b);
    }

    @Override
    public void min(int a, int b) {
        if (a < b)
            System.out.println("Smaller value is: " + a);
        else
            System.out.println("Smaller value is: " + b);
    }

    @Override
    public void abs(int n) {
        if (n < 0)
            System.out.println("Converted to positive: " + (-n));
        else
            System.out.println("Already positive: " + n);
    }

    
    @Override
    public void showDate() {
        System.out.println("Date display overridden.");
    }

    @Override
    public void showTime() {
        System.out.println("Time display overridden.");
    }

    @Override
    public void printLine() {
        System.out.println(".............");
    }

    @Override
    public void about() {
        System.out.println("RunOverride class with custom behavior");
    }

    public static void main(String[] args) {
        Main obj = new RunOverride();

        obj.add(10, 5);
        obj.subtract(10, 5);
        obj.multiply(10, 5);
        obj.divide(10, 5);

        obj.greet("Ajay");
        obj.printChars("JAVA");
        obj.concat("Hello", "World");
        obj.countChars("Override");

        obj.login();
        obj.logout();
        obj.openApp("Chrome");
        obj.closeApp("Chrome");

        obj.isEven(7);
        obj.max(10, 20);
        obj.min(10, 20);
        obj.abs(-50);

        obj.showDate();
        obj.showTime();
        obj.printLine();
        obj.about();
    }
}
