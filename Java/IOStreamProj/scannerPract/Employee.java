package scannerPract;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Employee Id: ");
		int id = sc.nextInt();
		
		System.out.println("Enter Employee Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
		sc.close();
		
	}
}
