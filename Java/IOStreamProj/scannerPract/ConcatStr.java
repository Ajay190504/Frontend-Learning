package scannerPract;

import java.util.Scanner;

public class ConcatStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two Strings to concat: ");
		
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		
		System.out.println("Concatenated String: "+str1.concat(str2));
		System.out.println("Concatenated String: "+(str1+" "+str2));
		sc.close();
	}

}
