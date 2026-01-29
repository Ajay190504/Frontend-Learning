package day1;

import java.util.Scanner;
public class TempConvert {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//from celsius to fahreheit
		float tempc = sc.nextFloat();
		float tempf;
		
		tempf = (tempc * (9/5.0f)) + 32.0f;
		
		System.out.println("Temp in Celcious: "+tempc+" Temp in fahrenheit: "+tempf);
		
//		//from fahrenheit to celsius
//		float tempc = sc.nextFloat();
//		float tempf;
//		tempc = (tempf-32)*(5/9.0f);
//		
//		System.out.println("Temp in Fahrenheit: "+tempf+" Temp in Celsius: "+tempc);
//		
		sc.close();
	}
}
