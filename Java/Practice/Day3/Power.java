package Day3;

public class Power {
	public static void main(String[] args) {
		int a = 3, b=5;
		
		int result=1;
		
		for(int i=1; i<=b; i++) {
			result*=a;
		}
		
		System.out.println(result);
	}
}
