package Day3;
import java.util.Scanner;
public class multTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//using 1 for loop
		for(int i=1; i<=10;i++) {
			System.out.print((i*num)+" ");
		}
		
		
		
		//usin 2 for loop
		for(int i=1;i<=10;i++) {
			for(int j=1; j<=10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		sc.close();
	}
	
}

