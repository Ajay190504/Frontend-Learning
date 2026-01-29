package loops;

public class LoopsPractice {

    public static void main(String args[]) {

    // 1) Print all numbers from 1 to 100 using for, while, and do-while loops.

        //using for loop
        System.out.println("For loop:");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //using while loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 100) {
            System.out.println(j);
            j++;
        }

        //using do-while loop
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 100);


    // 2) Print the multiplication table of 8 using for, while, and do-while loops.
        //using for loop
        System.out.println("Multiplication table of 8 using for loop:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + (8 * i));
        }

        //using while loop
        System.out.println("Multiplication table of 8 using while loop:");  
        int m = 1;
        while (m <= 10) {
            System.out.println("8 x " + m + " = " + (8 * m));
            m++;
        }

        //using do-while loop
        System.out.println("Multiplication table of 8 using do-while loop:");
        int n = 1;
        do {
            System.out.println("8 x " + n + " = " + (8 * n));
            n++;
        } while (n <= 10);

    // 3) Print the sum of digits of a number using while loop.
        int number = 12345; // Example number
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("Sum of digits of " + number + " is: " + sum);

    // 4) Print all even numbers between 1 to 200 using for loop.
        System.out.println("Even numbers between 1 to 200 using for loop:");
        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    // 5) Print the reverse of a number (e.g., 1234 → 4321) using while loop.
        int num = 1234;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number is: " + reversed);

    // 6) Print factorial of any number using do-while loop.
        int factNum = 5; // Example number
        int factorial = 1;
        int p = 1;
        do {
            factorial *= p;
            p++;
        } while (p <= factNum);
        System.out.println("Factorial of " + factNum + " is: " + factorial);

    // 7) Print Fibonacci series up to 10 terms using for loop.
        System.out.println("Fibonacci series up to 10 terms using for loop:");
        int a = 0, b = 1;
        for (int i = 1; i <= 10; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

    // 8) Print all numbers divisible by 3 and 5 between 1 and 150 using for loop.
        System.out.println("\nNumbers divisible by 3 and 5 between 1 and 150:");
        for (int i = 1; i <= 150; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    // 9) Count how many digits are in a number (e.g., 48793 → 5 digits) using while loop.
        int countNum = 48793; // Example number
        int count = 0;
        int tempCount = countNum;
        while (tempCount != 0) {
            tempCount /= 10;
            count++;
        }
        System.out.println("Number of digits in " + countNum + " is: " + count);

    // 10) Accept a number and print whether it is a palindrome or not using while loop.
        int palNum = 121; // Example number
        int originalNum = palNum;
        int revNum = 0;
        while (palNum != 0) {
            int digit = palNum % 10;
            revNum = revNum * 10 + digit;
            palNum /= 10;
        }
        if (originalNum == revNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
