package Day5;

public class Palindrome {

	public static void main(String[] args) {
			
			int num = 121 ;
			int org = num;
			int rem =0;
			int rev =0;
			
			while(num!=0) {
				rem = num%10;
				rev = rev*10+rem;
				num=num/10;
			}
			
			if(org==rev) {
				System.out.println(org+" is a Palindrome Number");
			}
			else {
				System.out.println(org+" is not a Palindrome Number");
			}
			


	}

}
