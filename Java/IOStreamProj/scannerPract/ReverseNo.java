package scannerPract;
import java.util.Scanner;

public class ReverseNo {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int digit=0;
		int reversedNum = 0;
		while(num!=0) {
			digit = num%10;
			reversedNum = reversedNum*10 + digit;
			num=num/10;
			
		}
		
		System.out.println("Reversed number : "+reversedNum);
		sc.close();
			}


}
