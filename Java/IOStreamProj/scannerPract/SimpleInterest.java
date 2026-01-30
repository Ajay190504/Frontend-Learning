package scannerPract;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principal amount: ");
		double amt = sc.nextDouble();
		
		System.out.println("Enter Rate of Interest: ");
		double roi = sc.nextDouble();
		
		System.out.println("Enter no. of Years: ");
		float time = sc.nextFloat();
		
		System.out.println("Simple Interest: "+((amt*roi*time)/100));
		sc.close();
	}

}
