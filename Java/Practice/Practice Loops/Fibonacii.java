
public class Fibonacii {

	public static void main(String[] args) {
	
			int num = 50;
			int term1 = 0, term2 = 1;
			
			System.out.print(term1 + " " + term2+  " ");
			
			for(int i=3; i<=num; i++) {
				
				int nextTerm =  term1+term2;
				System.out.print(nextTerm + " ");
				
				term1 = term2;
				term2 = nextTerm;
			}
	}

}
