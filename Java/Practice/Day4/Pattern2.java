package day4;

public class Pattern2 {

	public static void main(String[] args) {
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		int row=5, col=5;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//Number Patterns
		
		/*
		 1
		 2 2 
		 3 3 3
		 4 4 4 4
		 5 5 5 5 5
		 */
		
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 5
		 4 4
		 3 3 3
		 2 2 2 2
		 1 1 1 1 1
		 */
		
		for (int i = row; i >= 1; i--) {
			for (int j = i; j <= col ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 1
		 1 2
		 1 2 3
		 1 2 3 4
		 1 2 3 4 5
		 */
		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		/*
		 5
		 5 4
		 5 4 3
		 5 4 3 2
		 5 4 3 2 1
		 */
		
		for (int i = row; i >= 1; i--) {
			for (int j = col; j >= i ; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//Letter Patterns
		char r='E', c='E';
		
		/*
		 A
		 B B
		 C C C
		 D D D D
		 E E E E E
		 */
		
		//logic 1
		for(char ch='A';ch<=r;ch++) {
			for(char dh='A'; dh<=ch;dh++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 E
		 D D
		 C C C 
		 B B B B
		 A A A A A
		 */
		
		//logic 1
		for(char ch=r;ch>='A';ch--) {
			for(char dh=c; dh>=ch;dh--) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = row-1; i >= 0; i--) {
			for (int j = col-1; j >= i ; j--) {
				System.out.print((char)(65+i)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 A
		 A B
		 A B C
		 A B C D
		 A B C D E
		 */
		
		//logic 1
		for(char ch='A';ch<=r;ch++) {
			for(char dh='A'; dh<=ch;dh++) {
				System.out.print(dh+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		/*
		 E 
		 E D
		 E D C
		 E D C B
		 E D C B A
		 */
		//logic 1
		for(char ch=r;ch>='A';ch--) {
			for(char dh=c; dh>=ch;dh--) {
				System.out.print(dh+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//logic 2
		
		for (int i = row-1; i >= 0; i--) {
			for (int j = col-1; j >= i ; j--) {
				System.out.print((char)(65+j)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		
		
	}

}
