public class ForLoopBasics {
    public static void main(String[] args) {
        
      //Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }  

      //Print numbers from 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

      //Print all even numbers between 1 and 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

      //Print all odd numbers between 1 and 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

      //Print table of 5
        for (int i = 1; i <= 10; i++) {
            System.out.println("5 x " + i + " = " + (5 * i));
        }

      //Print table of any number (n = 7)
        int n = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

      //Print Hello 10 times
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
        }

      //Print sum of first 10 natural numbers
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

      //Print sum of even numbers from 1 to 100
        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);

      //Print sum of odd numbers from 1 to 100
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}