
public class checkPrime {
	public static void main(String[] args) {
		boolean isPrime = true;
		int num = 0;
		
		if(num<=1) {  // to handle negative numbers, 0 and 1
			isPrime = false;
		}
		else {
			for(int i=2; i<num; i++) {  //i<((num/2)+1) or Math.sqrt(num) can also be useed to reduce iterations
			
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(num + " is a prime number");
		}
		else {
			System.out.println(num+ " is not a prime number");
		}
	}
}
