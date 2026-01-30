package scannerPract;

import java.util.Scanner;

public class CheckChar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char to check: ");
		char ch = sc.next().toLowerCase().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+" is vowel");
		}
		else {
			System.out.println(ch+" is Consonant");
		}
		sc.close();
	}
}
