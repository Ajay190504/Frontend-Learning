package encapsulation.com;

public class RunPerson {
	
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.setAge(20);
		p1.setName("Ajay");
		
		System.out.println("Name: "+p1.getName()+" Age: "+p1.getAge());
	}
}
