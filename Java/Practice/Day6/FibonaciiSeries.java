package Day6;

public class FibonaciiSeries {

	public static void main(String[] args) {
		int n = 1;
		int t1=0, t2=1, tn=0;
		
		System.out.print(t1+" "+t2+" ");
		while(n<=8) {
			tn=t1+t2;
			System.out.print(tn+" ");
			t1=t2;
			t2=tn;
			n++;
			
		}
		

	}

}
