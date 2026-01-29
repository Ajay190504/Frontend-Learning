package constructors.parameterized;

public class  PrimeNo{
    boolean isPrime = true;
    public PrimeNo(int num) {
        for (int i = 2; i < ((num/2)+1); i++) {
            if (num%i==0) {
                isPrime=false;
            }
        }
    }

    public static void main(String[] args) {
        PrimeNo p1 = new PrimeNo(13);
        if(p1.isPrime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }
    }
    
}
