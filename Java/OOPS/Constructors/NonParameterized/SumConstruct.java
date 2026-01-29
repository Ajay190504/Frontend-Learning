package constructors.nonparameterized;

public class SumConstruct{
    int sum=0;
    public SumConstruct() {
        this.sum=5+4;
    }
    
    public static void main(String[] args) {
        SumConstruct sc1 = new SumConstruct();

        System.out.println("Sum: "+sc1.sum);
    }
}