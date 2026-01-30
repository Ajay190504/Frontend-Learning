package scannerPract;

import java.util.Scanner;

public class MarksPercent {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of Five Subjects out of 100: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int num5 = sc.nextInt();
		
		int total = num1+num2+num3+num4+num5;
		double percentage = (total*100)/500;
		
		System.out.println("Total Marks: "+total+" Percentage: "+percentage);
		sc.close();
		
	}
}
