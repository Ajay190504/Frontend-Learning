
public class EvenOdd {
	public static void main(String[] args) {
		int num = 15;
		//using %
		if(num%2==0) {
			System.out.println(num+" is Even");
		}
		else if(num==0) {
			System.out.println(num+" is Zero");
		}
		else {
			System.out.println(num+" is Odd");
		}
		
		//without using %
		if((num & 1) != 0) { 
			
			System.out.println(num+" is odd");
			 
		}
		else {
			System.out.println(num+" is Even");
		}

		//using division operator
		if((num/2)*2 == num) {
			System.out.println(num+" is Even");
		}
		else {
			System.out.println(num+" is Odd");
		}

		//using ternary operator
		String result = (num%2==0) ? (num+" is Even") : (num+" is Odd");
		System.out.println(result);
	}
}
