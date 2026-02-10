package inheritance.practice.pojo;

public class RunnerClass1 extends EmployeePojoClass {


	public RunnerClass1(int empId, String empName, String city, String cmpName, double empSalary, int i) {
		super(empId, empName, city, cmpName, empSalary, i);
	}

	public static void main(String[] args) {

		System.out.println("Creating object using Parameterized Constructor");
		
		RunnerClass1 emp1 = new RunnerClass1(45, "Ajay", "Pune", "Kiran Academy", 200000, 22);
		
		System.out.println("Employee details: ");
		System.out.println("Employee ID: "+emp1.empId);
		System.out.println("Employee Name: "+emp1.empName);
		System.out.println("Employee City: "+emp1.city);
		System.out.println("Company Name: "+emp1.cmpName);
		System.out.println("Employee Salary: "+emp1.empSalary);
		System.out.println("Employee Age: "+emp1.empAge);
		
	}

}
