package day1;


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
		
		//without using bitwise and (&)
		if((num & 1) != 0) { 
			
			System.out.println(num+" is odd");
			 
		}
		else {
			System.out.println(num+" is Even");
		}
		
		//using / (divide)
		if((num/2)*2 == num) {
			System.out.println(num + " is Even");
		}
		else {
			System.out.println(num + " is Odd");
		}
	}
}

