package day1;

import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tab = sc.nextInt();
		for(int i =1; i<=10; i++) {
			
			System.out.println(tab+" * "+i+" = "+(tab*i));
		}
		
		sc.close();
	}

}
