package scannerPract;

import java.util.Scanner;

public class PassOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter percent Marks: ");
		
		float percentMarks = sc.nextFloat();
		
		if(percentMarks>=35.0f) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		sc.close();

	}

}
