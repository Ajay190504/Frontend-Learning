package scannerPract;

import java.util.Scanner;

public class Bill {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price and Quantity of product: ");
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		
		System.out.println("Total Bill: "+(price*quantity));
		sc.close();
	}
}
