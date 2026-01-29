package classesAndObjects.basic;

public class Employee {
	
	int empAge;
	int empId;
	int salary;
	String empName;
	String deptName;
	Boolean isManager;
	
	void presenting(String name) {
		System.out.println(empName+" is presenting");
	}
	
	void learning() {
		System.out.println(this.empName+" is learning");
	}
	
	void developing(Employee emp) {
		System.out.println(emp.empName+" is developing");
	}
	
	void testing(String name) {
		System.out.println(empName+" is testing");
	}
	
	void deploying() {
		System.out.println(this.empName+" is deploying");
	}
	
	void showDetails(Employee aj) { 	
		System.out.println("Name: "+aj.empName); 
		System.out.println("ID: "+this.empId);	//can use 'this' also and no need of parameter
		System.out.println("Branch: "+this.deptName);
		System.out.println("Salary: "+this.salary);
		System.out.println("Engineering Student: "+aj.isManager);
	}
	
	public static void main(String[] args) {
		
		Employee aj = new Employee();
		
		aj.empName="Ajay";
		aj.deptName= "CS";
		aj.empAge=22;
		aj.empId=721;
		aj.salary=23672863;
		aj.isManager=false;
		
		aj.presenting(aj.empName);
		aj.learning();
		aj.developing(aj);
		aj.testing(aj.empName);
		aj.deploying();
		aj.showDetails(aj);
		
	}

}

