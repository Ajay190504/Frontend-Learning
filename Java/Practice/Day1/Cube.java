package day1;

import java.util.Scanner;
public class Cube {


		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			System.out.println("Cube of "+num+": "+(num*num*num));
	
			sc.close();
		}

	
}
