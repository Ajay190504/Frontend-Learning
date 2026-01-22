package com.type4;
// Type 4: Methods with parameters and with return type

public class MethodsWithParamsReturn {

    // 1) Check Prime No Method
    boolean isPrime(int num) {
        for (int i = 2; i <= (num / 2) + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 2) Check number is even or not
    boolean isEven(int num) {
        return num % 2 == 0;
    }

    // 3) Check Armstrong No Method
    boolean isArmstrong(int num) {
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

        return num == out;
    }

    // 4) Reversed number
    int getReversed(int num) {
        int rev = 0;

        while (num != 0) {
            int dig = num % 10;
            rev = (rev * 10) + dig;
            num /= 10;
        }

        return rev;
    }

    // 5) Average of 3 numbers
    float getAverage(int a, int b, int c) {
        return (a + b + c) / 3.0f;
    }

    // 6) Get grade based on marks
    char getGrade(int marks) {
        if (marks >= 90)
            return 'A';
        else if (marks >= 75)
            return 'B';
        else if (marks >= 60)
            return 'C';
        else
            return 'D';
    }

    // 7) Find factorial of a number
    long getFactorial(int num) {
        long fact = 1L;
        for (int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    }

    // 8) Find simple interest
    float getSimpleInterest(float p, float r, float t) {
        return (p * r * t) / 100;
    }

    // 9) Check if Palindrome or not
    boolean isPalindrome(int num) {
        int rev = 0, temp = num;

        while (temp != 0) {
            int dig = temp % 10;
            rev = rev * 10 + dig;
            temp /= 10;
        }

        return num == rev;
    }

    // 10) Get area of circle
    double getAreaOfCircle(double radius) {
        return 3.14 * radius * radius;
    }
}
