package constructors.parameterized;

public class Initialize{
    String name;
    int id;
    public Initialize(int id, String name) {
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Initialize it1 = new Initialize(12, "Ajay");
        System.out.println("Name: "+it1.name+" Id: "+it1.id);
    }
    
}
