package Day6;

public class SumNatural {

	public static void main(String[] args) {

		int sumOfSquares=0;
		int sumOfNumbers=0;
		int n = 1;
		int sumFormula=0;
		int ln =10;
		
		//Method 1:
		while(n<=10) {
			sumOfNumbers+=n;
			sumOfSquares+=n*n; //sum of squares
			n++;
		}

		//Method 2:
		sumFormula = ln*(ln+1)/2;
		
		
		System.out.println("Sum of first 10 Natural Numbers: "+sumFormula);
		System.out.println("Sum of first 10 Natural Numbers: "+sumOfNumbers);
		System.out.println("Sum of squares of  first 10 Natural Numbers: "+sumOfSquares);
	}

}
