package Day7;
import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		int count =0;
		int arm = 0;
		
		//Number of digits
		while(temp!=0) {
			temp/=10;
			count++;
		}
		System.out.println("Number of digits: "+count);
		temp=num;
		
		//Checking Armstrong Number or not
		while(temp!=0) {
			int dig = temp%10;
			int i=0;
			int pow = 1;
			//Finding Power of digit
			while(i<count) {
				pow*=dig;
				i++;
			}
			
			//adding to arm
			arm+=pow;
			
			//updating temp
			temp/=10;
		}
		
		if(arm==num) {
			System.out.println(num+" is an Armstrong Number");
		}
		else {
			System.out.println(num+" is not a Armstrong Number");
		}
	}

}
