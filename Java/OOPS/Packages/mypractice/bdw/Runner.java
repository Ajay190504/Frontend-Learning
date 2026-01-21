package mypractice.bdw;
import mypractice.adw.MyClass;  // Importing MyClass from adw package (different package), required to access it here

public class Runner {
    public static void main(String[] args) {
        
        MyClass obj = new MyClass(); // Creating an object of MyClass from adw package

        obj.show(); // Calling the show method from MyClass 

        System.out.println("Lucky number is: " + obj.lucky); // Accessing the lucky variable from MyClass
    }
}