package classesAndObjects.basic;

public class Student {
	
	int age;
	int id;
	String name;
	String branch;
	Boolean isEngStudent;
	
	void studying(String name) {
		System.out.println(name+" is studying");
	}
	
	void coding(String name) {
		System.out.println(name+" is is coding");
	}
	
	void playing() {
		System.out.println(this.name+" is playing");
	}
	
	void showDetails(Student aj) { 	
		System.out.println("Name: "+aj.name); 
		System.out.println("ID: "+this.id);	//can use 'this' also and no need of parameter
		System.out.println("Branch: "+aj.branch);
		System.out.println("Engineering Student: "+aj.isEngStudent);
	}

	public static void main(String[] args) {

		Student ajay = new Student();
		
		ajay.age =21;
		ajay.name = "Ajay";
		ajay.id = 1234;
		ajay.isEngStudent=true;
		ajay.branch = "CSE";
		
		ajay.studying("Ajay");
		ajay.coding("Ajay");
		ajay.showDetails(ajay);
		
		
		

	}

}

