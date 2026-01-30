package scannerPract;

import java.util.Scanner;

public class LargestOfThree {
	static int largest(int n1, int n2, int n3) {
		if(n1>n2) {
			if(n1>n3) {
				return n1;
			}
			else {
				return n3;
			}
		}
		else if(n3>n2) {
			if(n3>n1) {
				return n3;
			}
			else {
				return n1;
			}
		}
		else {
			return n2;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers To Find Largest: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		System.out.println("Max of "+num1+","+num2+","+num3+" is "+LargestOfThree.largest(num1,num2,num3));
		sc.close();
		
	}
}
