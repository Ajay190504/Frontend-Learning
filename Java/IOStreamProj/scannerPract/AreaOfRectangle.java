package scannerPract;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length and Breadth of Rectangle: ");
		double length = sc.nextDouble();
		double breadth = sc.nextDouble();
		
		System.out.println("Area of Rectangle: "+(length*breadth));
		sc.close();
	}
}
