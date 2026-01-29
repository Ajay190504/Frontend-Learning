package day3;
import  java.util.Scanner;
public class CountPosNeg {

	public static void main(String[] args) {
		int countPos=0, countNeg=0, countZero=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			int temp = sc.nextInt();
			if(temp>0) {
				countPos++;
			}
			else if(temp==0) {
				countZero++;
			}
			else {
				countNeg++;
			}
		}
		
		System.out.println("Positive Count: "+countPos);
		System.out.println("Neative Count: "+countNeg);
		System.out.println("Zero Count: "+countZero);

	}

}
