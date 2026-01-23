package com.allpract.type4;
//Type 4: Methods with parameters and with return type
public class MethodsRun {

    public static void main(String[] args) {

        MethodsWithParamsReturn obj = new MethodsWithParamsReturn();

        System.out.println(obj.isEven(21));
        System.out.println(obj.isPrime(23));
        System.out.println(obj.isArmstrong(153));
        System.out.println(obj.getReversed(12345));
        System.out.println(obj.getAverage(5, 6, 8));
        System.out.println(obj.getGrade(92));
        System.out.println(obj.getFactorial(16));
        System.out.println(obj.getSimpleInterest(1000, 5, 2));
        System.out.println(obj.isPalindrome(121));
        System.out.println(obj.getAreaOfCircle(5.3239285693));
    }
}
