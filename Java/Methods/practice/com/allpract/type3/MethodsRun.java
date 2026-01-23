package com.allpract.type3;
//Type 3: Methods with parameters and without return type
public class MethodsRun {

    public static void main(String[] args) {

        MethodsWithParamsNoReturn obj = new MethodsWithParamsNoReturn();

        obj.isEven(21);
        obj.isPrime(23);
        obj.isArmstrong(153);
        obj.getReversed(12345);
        obj.getAverage(5, 6, 8);
        obj.getGrade(92);
        obj.getFactorial(16);
        obj.getSimpleInterest(1000, 5, 2);
        obj.checkPalindrome(121);
        obj.getAreaOfCircle(5.3239285693);
    }
}
