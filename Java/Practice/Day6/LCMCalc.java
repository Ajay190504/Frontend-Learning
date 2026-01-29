package day6;

public class LCMCalc {

	public static void main(String[] args) {
		int a = 12, b = 18;
		int n1=a, n2=b;
		int hcf = 1;
		int div = 2;
		
		//Method 1:
		//1) Finding HCF
//		if (num1 > num2) {
//			for (int i = 1; i <= num2; i++) { 
//				if ((num1 % i == 0) && (num2 % i == 0)) {
//					hcf = i; //i will alsways greater than hcf
//				}
//			}
//		} 
//		else {
//			for (int i = 1; i <= num1; i++) {
//				if ((num2 % i == 0) && (num1 % i == 0)) {
//					hcf = i;  //i will alsways greater than hcf
//				}
//			}
//		}
//		System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + hcf);

		//1) Finding HCF
		while (a>=div && b>=div) {
		    if (a % div == 0 && b % div == 0) {
		        
		        a = a / div;
		        b = b / div; 
		        hcf = hcf * div;
		        
		    } else {
		        div++;
		    }
		}
		
		//2) Finding LCM using HCF
	   //int lcm = a*b*hcf; //method 1 //updated values of a and b
		
		//2) Finding LCM using HCF
		 int lcm = (n1*n2)/hcf; //method 2 //original values of a and b

	     System.out.println("GCD: " + hcf);
	     System.out.println("LCM: " + lcm);
	     
	     
	     
	     
////	Other Methods Method:
//		 1. Find GCD first
//	        int  n1=a;
//	        int n2=b;;
//	        while (n2 != 0) {
//	            int temp = n2;
//	            n2 = n1 % n2;
//	            n1 = temp;
//	        }
//	        int gcd = n1;
//
//	         2. Use the formula to find LCM
//	         Formula: (n1 * n2) / gcd //using original numbers
//         	 Formula: a*b*gcd //using updated numbers
//	        int lcm = (n1 * n2) / gcd;
//
//	        System.out.println("GCD: " + gcd);
//	        System.out.println("LCM: " + lcm);
//	        
//	        //Method 2:
//	        int max = Math.max(a, b);
//
//			while (true) {
//			    if (max % a == 0 && max % b == 0) {
//			        System.out.println("LCM is: " + max);
//			        break;
//			    }
//			    max++;
//			}
//
//	       
//			Method 3: 
//			int a = 12, b = 18;
//			int lcm = 1;
//			int div = 2;
//
//			while (a > 1 || b > 1) {
//			    if (a % div == 0 || b % div == 0) {
//			        lcm *= div;
//			        if (a % div == 0) a /= div;
//			        if (b % div == 0) b /= div;
//			    } else {
//			        div++;
//			    }
//			}
//			System.out.println("LCM is: " + lcm);

	}

}
