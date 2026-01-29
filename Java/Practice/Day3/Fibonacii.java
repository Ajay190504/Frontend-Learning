package day3;

import java.util.Scanner;

public class Fibonacii {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		
		int n1 = 0;
		int n2 = 1;
		int f = 0;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		for(int i=1; i<=num; i++) {
			
			f=n1+n2;
			System.out.print(f+" ");
			n1=n2;
			n2=f;
		}

	}

}
