package Day5;

public class CountOfDigits {

	public static void main(String[] args) {
		int count=0;
		int num = 12345;
		
		while(num!=0) {
			num=num/10;
			count++;
			
		}
		System.out.println("Count of digits : "+count);
	}

}
