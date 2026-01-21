package ClassesAndObjects;

public class Animal {
	int age;
	float height;
	float weight;
	String name;
	String type;
	
	void run(String name) {
		System.out.println(name+" is running");
	}
	void hunting(String name) {
		System.out.println(name+" is hunting");
	}
	void eating(String name) {
		System.out.println(name+" is eating");
	}
	
	public static void main(String[] args) {
		Animal dog = new Animal();
		
		dog.age = 12;
		dog.height = 128.50f;
		dog.weight = 33.48f;
		dog.type = "Mammal";
		dog.name = "Puppy";
		
		System.out.println("Name: "+dog.name+" Height: "+dog.height+" Weight: "+dog.weight+" type: "+dog.type);
		dog.run("Puppy");
		dog.eating("Puppy");
		dog.hunting("Puppy");
		
		System.out.println();
		System.out.println();
		
		Animal crocodile = new Animal();
		
		crocodile.age = 38;
		crocodile.height = 180.50f;
		crocodile.weight = 203.48f;
		crocodile.type = "Reptile";
		crocodile.name = "croco";
		
		System.out.println("Name: "+crocodile.name+" Height: "+crocodile.height+" Weight: "+crocodile.weight+" type: "+crocodile.type);
		dog.run("croco");
		dog.eating("croco");
		dog.hunting("croco");
		
		

	}

}
