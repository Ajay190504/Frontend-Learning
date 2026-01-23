package com.allpract.type1;
// Type 1: Methods without parameters and without return type

public class MethodsNoParamsNoReturn {

    // 1) Check Prime No Method
    void isPrime() {
        int num = 23;
        boolean prime = true;

        for (int i = 2; i <= (num / 2) + 1; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        System.out.println(num + " is Prime? " + prime);
    }

    // 2) Check number is even or not
    void isEven() {
        int num = 21;
        if (num % 2 == 0)
            System.out.println(num + " is Even");
        else
            System.out.println(num + " is Odd");
    }

    // 3) Check Armstrong No Method
    void isArmstrong() {
        int num = 153;
        int temp = num, out = 0, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        while (temp != 0) {
            int dig = temp % 10;
            int pow = 1;

            for (int i = 1; i <= count; i++) {
                pow *= dig;
            }

            out += pow;
            temp /= 10;
        }

        if (num == out)
            System.out.println(num + " is Armstrong");
        else
            System.out.println(num + " is NOT Armstrong");
    }

    // 4) Reversed number
    void getReversed() {
        int num = 12345;
        int rev = 0;

        while (num != 0) {
            int dig = num % 10;
            rev = (rev * 10) + dig;
            num /= 10;
        }

        System.out.println("Reversed number = " + rev);
    }

    // 5) Average of 3 numbers
    void getAverage() {
        int a = 5, b = 6, c = 8;
        float avg = (a + b + c) / 3.0f;
        System.out.println("Average = " + avg);
    }

    // 6) Get grade based on marks
    void getGrade() {
        int marks = 92;
        char grade;

        if (marks >= 90)
            grade = 'A';
        else if (marks >= 75)
            grade = 'B';
        else if (marks >= 60)
            grade = 'C';
        else
            grade = 'D';

        System.out.println("Grade = " + grade);
    }

    // 7) Find factorial of a number
    void getFactorial() {
        int num = 16;
        long fact = 1L;

        for (int i = num; i >= 1; i--) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }

    // 8) Find simple interest
    void getSimpleInterest() {
        float p = 1000, r = 5, t = 2;
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // 9) Check if Palindrome or not
    void checkPalindrome() {
        int num = 121;
        int rev = 0, temp = num;

        while (temp != 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }

        if (num == rev)
            System.out.println(num + " is Palindrome");
        else
            System.out.println(num + " is NOT Palindrome");
    }

    // 10) Get area of circle
    void getAreaOfCircle() {
        double radius = 5.3239285693;
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }
}
