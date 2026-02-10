package inheritance.practice.pojo;

public class RunnerClass4  {

	public static void main(String[] args) {
		
		EmployeePojoClass emp1 = new EmployeePojoClass();
		
		emp1.setEmpId(45);
		emp1.setEmpName("Ajay");
		emp1.setCity("Pune");
		emp1.setCmpName("Kiran Academy");
		emp1.setEmpSalary(2000000);
		emp1.setEmpAge(22);
		
		System.out.println("Employee details: ");
		System.out.println("Employee ID: "+emp1.getEmpId());
		System.out.println("Employee Name: "+emp1.getEmpName());
		System.out.println("Employee City: "+emp1.getCity());
		System.out.println("Company Name: "+emp1.getCmpName());
		System.out.println("Employee Salary: "+emp1.getEmpSalary());
		System.out.println("Employee Age: "+emp1.getEmpAge());
	}

}
