package scannerPract;

import java.util.Scanner;

public class CheckNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Positive, Negative or Zero: ");
		int num = sc.nextInt();
		
		if(num<0) {
			System.out.println(num+" is Negative");
		}
		else if(num==0) {
			System.out.println(num+" is Zero");
		}
		else {
			System.out.println(num+" is Positive");
		}
		
		sc.close();
	}
}
