package com.jbk; //Current package

import com.tka.Demo; //Import class Demo from package com.tka, required to access Demo class from different package

public class Main {

	public static void main(String[] args) {

		Demo d = new Demo(); //Creating object of Imported Demo class

		System.out.println("Name is: " + d.name); //Accessing the name variable from Imported Demo class

	}

}
