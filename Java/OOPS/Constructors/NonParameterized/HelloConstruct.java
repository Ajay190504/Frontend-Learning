public class HelloConstruct{

    public HelloConstruct() {
        System.out.println("Hello From HelloConstructor Class");
    }

    
    public static void main(String[] args) {
        HelloConstruct constr1 = new HelloConstruct();

        System.out.println(constr1);
    }
}