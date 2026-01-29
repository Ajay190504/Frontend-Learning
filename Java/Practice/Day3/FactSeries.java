package day3;

public class 	FactSeries {

	public static void main(String[] args) {
		int n = 5;
		
		for(int j=0; j<=n; j++) {
			
		int num = j;
		int fact = 1;
		if(num==1 || num==0) {
			System.out.print(fact+" ");
		}
		else {
		for(int i=num;i>1;i--) {
			fact=fact*i;
		}
			System.out.print(fact+" ");
		}
		
		}
		
	}

}
