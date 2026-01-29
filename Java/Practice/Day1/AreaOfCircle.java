package day1;

import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		double pi = 3.14f;
		Scanner sc = new Scanner(System.in);
		
		double rad = sc.nextDouble();
		
		System.out.println("Area of circle :"+ (pi*rad*rad));
		sc.close();
	}

}
