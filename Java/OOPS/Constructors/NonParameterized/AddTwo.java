package constructors.nonparameterized;

import java.util.Scanner;

public class AddTwo{

    public AddTwo() {
        System.out.println("Welcome to Add Two Program !");
        System.out.println("Please Enter two digits to perform Addition: ");
    }
    public static void main(String[] args) {
       
        AddTwo ad1 = new AddTwo();
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Addition of "+num1+" and "+num2+" : "+(num1+num2));

    }

}