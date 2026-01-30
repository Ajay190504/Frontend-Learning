package scannerPract;

import java.util.Scanner;

public class Perimeter {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three sides To Find Perimeter of Triangle: ");
		double side1 = sc.nextDouble();
		double side2 = sc.nextDouble();
		double side3 = sc.nextDouble();
		
		System.out.println("Perimeter of Triangle: "+(side1+side2+side3));
		sc.close();
		
	}
}
