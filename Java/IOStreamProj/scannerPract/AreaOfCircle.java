package scannerPract;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Radius of Circle: ");
		double radius = sc.nextDouble();
		
		double area = 3.14*radius*radius;
		
		System.out.println("Area of Circle with Radius: "+area);
		
		sc.close();
	}
}
