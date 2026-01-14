package Day5;

public class SumOfFactors {

	public static void main(String[] args) {
		int num = 22;
		int i =1;
		int sum=0;
		while(i<=num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		System.out.print("Sum of factors : "+sum);
	}

}
