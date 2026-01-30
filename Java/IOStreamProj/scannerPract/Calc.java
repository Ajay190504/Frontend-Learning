package scannerPract;

import java.util.Scanner;

public class Calc {
	static int Mult(int num1, int num2) {
		return num1*num2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers To Multiply: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Multiplication of "+num1+" and "+num2+" : "+Calc.Mult(num1,num2));
		
		System.out.println("Enter Two numbers To Divide: ");
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		if(num4==0) {
			System.out.println("Division of "+num3+" and "+num4+" : "+" cannot be Determined");
		}
		else {
			System.out.println("Multiplication of "+num3+" and "+num4+" : "+(num3/num4));
		}
		sc.close();
	}
}
