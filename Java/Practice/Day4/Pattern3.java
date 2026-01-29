package day4;

public class Pattern3 {

	public static void main(String[] args) {
		//Pattern3
				/*
				 * * * * *
				 * * * *
				 * * * 
				 * *
				 * *
				 */
		int row = 5, col=5;
				//logic 1
				for (int i = 0; i < row; i++) {
					for (int j = i; j < col; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				
				//logic 2
				for (int i = row; i >=1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("* ");
					}
					System.out.println();
				}

	}

}
