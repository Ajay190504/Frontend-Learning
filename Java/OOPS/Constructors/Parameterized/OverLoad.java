package constructors.parameterized;

public class OverLoad{
    String name;

    public OverLoad(){
        System.out.println("Hello! Ajay This is default Constuctor");
    }
    public OverLoad(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        OverLoad ol = new OverLoad();
        OverLoad ol1 = new OverLoad("Ajay");

        System.out.println("Hello! "+ol1.name+" and This is Parameterized Constructor");

    }
    
}
