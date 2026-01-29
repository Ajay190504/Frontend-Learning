package day3;

public class SumFactorial {

	public static void main(String[] args) {
		int n = 5;
		int factSum=0;
		for(int j=0; j<=n; j++) {
			
		int num = j;
		int fact = 1;
		if(num==1 || num==0) {
			fact = 1;
		}
		else {
		for(int i=num;i>1;i--) {
			fact=fact*i;
		}
		
		}
		factSum = factSum+fact;
		}
		System.out.println("Factorial Sum: "+factSum);
	}

}
