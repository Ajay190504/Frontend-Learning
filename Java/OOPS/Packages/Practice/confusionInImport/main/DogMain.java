package com.main;


//importing Dog class from com.animal package
import com.animal.Dog;

public class DogMain {

	public static void main(String[] args) {

		Dog d = new Dog();  //Object creation of Dog class from com.animal package
		d.m2();  //calling m2() method from Dog class of com.animal package

		com.pets.Dog d1 = new com.pets.Dog(); //Object creation of Dog class from com.pets package, 
		// using fully qualified name to avoid confusion
		d1.m1(); //calling m1() method from Dog class of com.pets package

	}

}
