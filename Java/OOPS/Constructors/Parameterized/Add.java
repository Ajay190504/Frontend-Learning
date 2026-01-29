package constructors.parameterized;

public class Add{
    int addition = 0;
    public Add(int n1, int n2) {
        this.addition=n1+n2;
    }
    
    public static void main(String[] args) {
        Add ad = new Add(12, 12);
        System.out.println(ad.addition);
    }
}