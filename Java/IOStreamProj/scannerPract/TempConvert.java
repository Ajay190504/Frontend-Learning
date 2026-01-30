package scannerPract;

import java.util.Scanner;

public class TempConvert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius: ");
		double temp = sc.nextDouble();
		
		double tempFah = (temp*9/5)+32;
		
		System.out.println("Temperature in Fahrenheit: "+tempFah);
		sc.close();
	}

}
