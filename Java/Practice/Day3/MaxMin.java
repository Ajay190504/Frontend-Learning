package day3;
import  java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		int countPos=0, countNeg=0, countZero=0;
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<10; i++) {
			 int temp = sc.nextInt();
			 if(temp>max) {
				 max=temp;
			 }
			 if(temp<min) {
				 min=temp;
			 }	 
		}
		
		System.out.println("Max: "+max+" Min: "+min);
	

	}

}
