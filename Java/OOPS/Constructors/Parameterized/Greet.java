package constructors.parameterized;

public class Greet{
    String name;

    public Greet(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Greet g1 = new Greet("Ajay");
        System.out.println("Name: "+g1.name);
    }
}