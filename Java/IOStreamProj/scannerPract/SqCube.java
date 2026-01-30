package scannerPract;

import java.util.Scanner;

public class SqCube {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to find Square and Cube: ");
		
		int num=sc.nextInt();
		System.out.println("Square: "+(num*num)+" Cube: "+(num*num*num));
		sc.close();
	}

}
