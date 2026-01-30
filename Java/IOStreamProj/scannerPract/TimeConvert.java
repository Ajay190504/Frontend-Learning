package scannerPract;

import java.util.Scanner;

public class TimeConvert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter time in hours: ");
		float time = sc.nextFloat();
		
		int timeInSec = (int)time*3600;
		int timeInMin = (int)time*60;
		
		System.out.println("Time in Minute: "+timeInMin+" Time in Second: "+timeInSec);
		sc.close();
	}
}
