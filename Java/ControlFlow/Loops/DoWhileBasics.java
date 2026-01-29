package loops;

public class DoWhileBasics {
    public static void main(String[] args) {

        // Print numbers from 1 to 10
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        // Print numbers from 10 to 1
        int j = 10;
        do {
            System.out.println(j);
            j--;
        } while (j >= 1);

        // Print all even numbers between 1 and 50
        int k = 1;
        do {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        } while (k <= 50);

        // Print all odd numbers between 1 and 50
        int m = 1;
        do {
            if (m % 2 != 0) {
                System.out.println(m);
            }
            m++;
        } while (m <= 50);

        // Print table of 5
        int n = 1;
        do {
            System.out.println("5 x " + n + " = " + (5 * n));
            n++;
        } while (n <= 10);

        // Print table of any number (n = 7)
        int p = 1;
        int num = 7;
        do {
            System.out.println(num + " x " + p + " = " + (num * p));
            p++;
        } while (p <= 10);

        // Print Hello 10 times
        int q = 1;
        do {
            System.out.println("Hello");
            q++;
        } while (q <= 10);

        // Print sum of first 10 natural numbers
        int sum = 0;
        int r = 1;
        do {
            sum += r;
            r++;
        } while (r <= 10);
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Print sum of even numbers from 1 to 100
        int evenSum = 0;
        int s = 1;
        do {
            if (s % 2 == 0) {
                evenSum += s;
            }
            s++;
        } while (s <= 100);
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);

        // Print sum of odd numbers from 1 to 100
        int oddSum = 0;
        int t = 1;
        do {
            if (t % 2 != 0) {
                oddSum += t;
            }
            t++;
        } while (t <= 100);
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}
   