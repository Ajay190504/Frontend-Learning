package Day7;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int num1=0, num2=1, fib=0;
		
		System.out.print(num1+" "+num2+" ");
		
		for(int i=1; i<=(n-2);i++) {
			fib=num1+num2;
			System.err.print(fib+" ");
			num1=num2;
			num2=fib;
		}

	}

}
