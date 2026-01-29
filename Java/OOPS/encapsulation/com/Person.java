package encapsulation.com;

public class Person {
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}
