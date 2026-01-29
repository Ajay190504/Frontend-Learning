package constructors.nonparameterized;
public class Initialize{
    String name;

    public Initialize() {
        this.name="Ajay"; //this used to point current object
    }
    
    public static void main(String[] args) {
        Initialize obj = new Initialize();
        System.out.println("Name: "+obj.name);
    }
}