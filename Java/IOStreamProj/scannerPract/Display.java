package scannerPract;

import java.util.Scanner;

public class Display {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age and Name to Display: ");
		int age = sc.nextInt();
		String name = sc.nextLine();
		
		System.out.println("Name: "+name+" Age: "+age);
		sc.close();
	}
}
