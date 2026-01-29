package day6;

public class HCFCalc {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 15;
		int hcf = 1;
		
		//Method 1 : by common factors
		if (num1 > num2) {
			for (int i = 1; i <= num2; i++) { 
				if ((num1 % i == 0) && (num2 % i == 0)) {
					hcf = i; //i will alsways greater than hcf
				}
			}
		} 
		else {
			for (int i = 1; i <= num1; i++) {
				if ((num2 % i == 0) && (num1 % i == 0)) {
					hcf = i;  //i will alsways greater than hcf
				}
			}
		}
		System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + hcf);

		/* By AI
		// Java example using a simple for loop
		class Main {
		    public static void main(String[] args) {
		        int n1 = 81, n2 = 153;
		        int gcd = 1; // Initialize gcd

		        for (int i = 1; i <= n1 && i <= n2; ++i) {
		            // Check if i perfectly divides both n1 and n2
		            if (n1 % i == 0 && n2 % i == 0) {
		                gcd = i;
		            }
		        }
		        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
		    }
		}
*/
		//Method 2 : by finding remainder
//		int a = num1, b = num2;
//		//int hcf = 1;
//		int div = 2;
//
//		// Use Math.min to ensure we don't loop more than necessary
//		while (div <= a && div <= b) {
//		    if (a % div == 0 && b % div == 0) {
//		        hcf = hcf * div;
//		        a = a / div;
//		        b = b / div; // Fixed the override bug here
//		    } else {
//		        div++;
//		    }
//		}
//		System.out.println("HCF is " + hcf);

		/*
		//Method 3: Eucladian Algorithm
		
		 // Store original values for final display
        int a = num1;
        int b = num2;
        
        // Euclidean algorithm using modulo (%) inside a while loop
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        // When b becomes 0, 'a' contains the GCD
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + a);
        */
		
		
		
//	
	}
}
