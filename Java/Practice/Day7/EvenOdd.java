package Day7;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//Method 1
		if(num%2==0) {
			System.out.println(num+" is an even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		
		//Method 2
		if((num&1)==0) {
			System.out.println(num+" is an even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		
		//Method 3
		if((num/2*2)==num) {
			System.out.println(num+" is an even number");
		}
		else {
			System.out.println(num+" is a odd number");
		}
		
	}

}
