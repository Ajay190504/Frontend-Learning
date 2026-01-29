
public class reverseNum {
	public static void main(String[] args) {
		
		int num = 101;
		int reversedNum = 0;
		while(num>0) {			
			int digit = num%10;
			reversedNum = reversedNum * 10 + digit;
			num = num/10;
		}
		
		System.out.println("Reversed Number : "+ reversedNum);
	}
}
