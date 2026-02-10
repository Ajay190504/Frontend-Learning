package inheritance.practice.pojo;

public class EmployeePojoClass{
	
	int empId;
	String empName;
	String city;
	String cmpName;
	double empSalary;
	int empAge;
	
	//Default Constructor
	public EmployeePojoClass(){
		System.out.println("This is Employee Pojo Class Default constructor");
	}

	//Parameterized Constructor
	public EmployeePojoClass(int empId, String empName, String city, String cmpName, double empSalary, int i) {
		this.empId = empId;
		this.empName = empName;
		this.city = city;
		this.cmpName = cmpName;
		this.empSalary = empSalary;
		this.empAge = i;
	}
	
	//Copy Constructor
	public static EmployeePojoClass m1() {
		return new EmployeePojoClass();
	}

	//Getters and Setters
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCmpName() {
		return cmpName;
	}


	public void setCmpName(String cmpName) {
		this.cmpName = cmpName;
	}


	public double getEmpSalary() {
		return empSalary;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public int getEmpAge() {
		return empAge;
	}


	public void setEmpAge(int i) {
		this.empAge = i;
	}
	
}
