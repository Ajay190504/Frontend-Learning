package inheritance.practice.pojo;
import java.util.Scanner;
public class RunnerClass3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Creating object using Scaner and  Parameterized Constructor");
		System.out.println("Enter Employee ID, Name, City, Company Name, Salary, Age:  ");
		
		int empId=sc.nextInt();
		String empName = sc.nextLine();
		String city = sc.nextLine();
		String cmpName = sc.nextLine();
		sc.nextLine();
		double empSalary = sc.nextDouble();
		int empAge = sc.nextInt();
	
		RunnerClass1 emp1 = new RunnerClass1(empId, empName, city, cmpName, empSalary, empAge);
		
		
		System.out.println("Employee details: ");
		System.out.println("Employee ID: "+emp1.empId);
		System.out.println("Employee Name: "+emp1.empName);
		System.out.println("Employee City: "+emp1.city);
		System.out.println("Company Name: "+emp1.cmpName);
		System.out.println("Employee Salary: "+emp1.empSalary);
		System.out.println("Employee Age: "+emp1.empAge);
		
		sc.close();
	}

}
