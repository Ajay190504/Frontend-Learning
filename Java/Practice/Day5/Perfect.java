package Day5;

public class Perfect {

	public static void main(String[] args) {
		int num = 6;
		int i =1;
		int sum=0;
		while(i<num) {
			if(num%i==0) {
				sum+=i;
			}
			i++;
		}
		
		if(num==sum) {
			System.out.println(num+" is a Perfect Number");
		}
		else {
			System.out.println(num+" is not a Perfect Number");
		}

		
	}

}
