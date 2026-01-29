package day1;

import java.util.Scanner;
public class Swap {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Before Swap: ");
			System.out.println("num1: "+num1+" num2: "+num2);
			
			//Swap usin 3rd var
			int temp = num2;
			num2 = num1;
			num1 = temp;
//			
			System.out.println("After Swap: ");
			System.out.println("num1: "+num1+" num2: "+num2);
			
//			//Using add and subtract
			num1=num1+num2;
			num2=num1-num2;
			num1=num1-num2;
//			
			System.out.println("After Swap: ");
			System.out.println("num1: "+num1+" num2: "+num2);
//			
			//usiing mullt and divide 
			num1=num1*num2;
			num2=num1/num2;
			num1=num1/num2;
			
			System.out.println("After Swap: ");
			System.out.println("num1: "+num1+" num2: "+num2);
//			
			//using bitwise and 
	
			num1=num1^num2;
			num2=num1^num2;
			num1=num1^num2;
						
			System.out.println("After Swap: ");
			System.out.println("num1: "+num1+" num2: "+num2);
//					
			sc.close();
		}

	
}

