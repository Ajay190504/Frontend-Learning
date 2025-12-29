public class WhileLoopBasics {
    public static void main(String[] args) {
        
      //Print numbers from 1 to 10
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }  

      //Print numbers from 10 to 1
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

      //Print all even numbers between 1 and 50
        int k = 1;
        while (k <= 50) {
            if (k % 2 == 0) {
                System.out.println(k);
            }
            k++;
        }

      //Print all odd numbers between 1 and 50
        int m = 1;
        while (m <= 50) {
            if (m % 2 != 0) {
                System.out.println(m);
            }
            m++;
        }

      //Print table of 5
        int n = 1;
        while (n <= 10) {
            System.out.println("5 x " + n + " = " + (5 * n));
            n++;
        }

      //Print table of any number (n = 7)
        int p = 1;
        int num = 7;
        while (p <= 10) {
            System.out.println(num + " x " + p + " = " + (num * p));
            p++;
        }

      //Print Hello 10 times
        int q = 1;
        while (q <= 10) {
            System.out.println("Hello");
            q++;
        }

      //Print sum of first 10 natural numbers
        int sum = 0;
        int r = 1;
        while (r <= 10) {
            sum += r;
            r++;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

      //Print sum of even numbers from 1 to 100
        int evenSum = 0;
        int s = 1;
        while (s <= 100) {
            if (s % 2 == 0) {
                evenSum += s;
            }
            s++;
        }
        System.out.println("Sum of even numbers from 1 to 100: " + evenSum);

      //Print sum of odd numbers from 1 to 100
        int oddSum = 0;
        int t = 1;
        while (t <= 100) {
            if (t % 2 != 0) {
                oddSum += t;
            }
            t++;
        }
        System.out.println("Sum of odd numbers from 1 to 100: " + oddSum);
    }
}