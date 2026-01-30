package scannerPract;

import java.util.Scanner;


public class Addition {
	
	static int Add(int num1, int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two numbers To Add: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		System.out.println("Addition of "+num1+" and "+num2+" : "+Addition.Add(num1,num2));
		sc.close();
	}
}
