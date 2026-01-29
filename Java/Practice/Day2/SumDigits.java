package day2;

public class SumDigits {

	public static void main(String[] args) {
		// Sum of even digits of number
		
		int num = 54326;
		int oddSum = 0;
		int evenSum = 0;
		while(num>0) {
			int rem = num%10;
			if(rem%2==0) {
				evenSum+=rem;
			}
			else {
				oddSum+=rem;
			}
			num/=10;
		}
		System.out.println("Sum of Even Digits: "+evenSum+ " Sum of Odd digits: "+oddSum);

	}

}
