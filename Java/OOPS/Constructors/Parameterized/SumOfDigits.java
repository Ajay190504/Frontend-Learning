package constructors.parameterized;

public class SumOfDigits{
	   int sum=0;
	   public SumOfDigits(int num) {
	        while(num!=0){
	            int dig = num%10;
	            this.sum+=dig;
	            num/=10;
	        }
	    }

	    public static void main(String[] args) {
	        SumOfDigits sd = new SumOfDigits(1234);

	        System.out.println("Sum of Digits: "+sd.sum);
	    }
	    
	}

