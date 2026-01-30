package scannerPract;

import java.util.Scanner;

public class PrintLine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line to Print: ");
		String newLine = sc.nextLine();
		
		System.out.println("User Entered this Line : "+newLine);
		sc.close();
	}
}
