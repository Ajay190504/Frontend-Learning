package Day5;

public class SumOfDigits {

	public static void main(String[] args) {
		int sum=0;
		int num=1234;
		int rem=0;
		
		while(num!=0) {
			rem = num%10;
			sum += rem;
			num=num/10;
			
		}
		System.out.println("Sum of digits: "+sum);

	}

}
