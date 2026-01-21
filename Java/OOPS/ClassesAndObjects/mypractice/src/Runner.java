package mypractice.src;

//accessing class members from different class in same package
public class Runner {
    public static void main(String[] args) {

        MyClass obj = new MyClass(); //create object of MyClass of same package

        obj.myValue(25); //accessing method of MyClass using object

        System.out.println("n value : " + obj.n); //accessing variable of MyClass using object
    }
}