package packages.confusion.main;

//importing Dog class from com.animal package
import packages.confusion.animal.Dog;

public class DogMain {

	public static void main(String[] args) {

		Dog d = new Dog();  //Object creation of Dog class from com.animal package
		d.m2();  //calling m2() method from Dog class of com.animal package

		packages.confusion.pets.Dog d1 = new packages.confusion.pets.Dog(); //Object creation of Dog class from com.pets package
		// using fully qualified name to avoid confusion
		d1.m1(); //calling m1() method from Dog class of com.pets package

	}

}
