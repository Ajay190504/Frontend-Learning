package constructors.nonparameterized;

public class SumOfDigits{
    int num=1234;
    int sum=0;

    public SumOfDigits() {
        while(this.num!=0){
            int dig = this.num%10;
            this.sum+=dig;
            this.num/=10;
        }
    }

    public static void main(String[] args) {
        SumOfDigits sd = new SumOfDigits();

        System.out.println("Sum of digits: "+sd.sum);
    }
    
    
}

