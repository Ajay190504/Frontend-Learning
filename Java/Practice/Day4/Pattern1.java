package day4;

import java.util.Iterator;

public class Pattern1 {

	public static void main(String[] args) {
		/*
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 */
		int rows=5;
		int col=5;
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
			System.out.print("* ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		/*
		 1 2 3 4 5 
		 1 2 3 4 5
		 1 2 3 4 5
		 1 2 3 4 5
		 1 2 3 4 5
		 */
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= col; j++) {
			System.out.print(j+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 1 1 1 1 1 
		 2 2 2 2 2 
		 3 3 3 3 3 
		 4 4 4 4 4
		 5 5 5 5 5
		 */
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= col; j++) {
			System.out.print(i+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		/* 
		 1 2 3 4 5 
		 6 7 8 9 10
		 11 12 13 14 15 
		 16 17 18 19 20
		 21 22 23 24 25
		 */
		int count=1;
		for (int i = 1; i <= rows; i++) {
		for (int j = 1; j <=  col; j++) {
		System.out.print(count+"   ");
		count++;
		}
		System.out.println();
	}
		
		System.out.println();
		System.out.println();
		
		/*
		 25 24 23 22 21
		 20 19 18 17 16
		 15 14 13 12 11
		 10 9 8 7 6 
		 5  4 3 2 1
		 */
		
		int cnt=25;
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < col; j++) {
		System.out.print(cnt+"   ");
		cnt--;
		}
		System.out.println();
	}
		System.out.println();
		System.out.println();
		
		/*
		 A B C D E
		 A B C D E
		 A B C D E
		 A B C D E
		 A B C D E
		 */
		char r='E';
		char c='E';
		//logic 1
		for(char ch='A'; ch<=r;ch++) {
			for(char dh='A'; dh<=c;dh++) {
				System.out.print(dh+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
			System.out.print((char)(65+j)+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 E D C B A
		 E D C B A
		 E D C B A
		 E D C B A
		 E D C B A
		 */

		for(char ch='A'; ch<=r;ch++) {
			for(char dh='E'; dh>='A';dh--) {
				System.out.print(dh+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = 0; i < rows; i++) {
			for (int j = 4; j >= 0; j--) {
			System.out.print((char)(65+j)+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		
		
		/*
		 A A A A A
		 B B B B B
		 C C C C C
		 D D D D D 
		 E E E E E
		 */
		
		//logic 1
		for(char ch='A'; ch<=r;ch++) {
			for(char dh='A'; dh<=c;dh++) {
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		//logic 2
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < col; j++) {
			System.out.print((char)(65+i)+" ");	
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		/*
		 E E E E E
		 D D D D D
		 C C C C C
		 B B B B B
		 A A A A A 
		 */
		
		//logic 1
				for(char ch='E'; ch>='A';ch--) {
					for(char dh='A'; dh<=c;dh++) {
						System.out.print(ch+" ");
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
				
				//logic 2
				for (int i = 4; i >= 0; i--) {
					for (int j = 0; j < col; j++) {
					System.out.print((char)(65+i)+" ");	
					}
					System.out.println();
				}
				
				System.out.println();
				System.out.println();
		
		/*
		 A B C D E 
		 F G H I J 
		 K L M N O
		 P Q R S T 
		 U V W X Y
		 */
		//logic 1
		char k = 'A';
		for(char ch='A'; ch<=r;ch++) {
			for(char dh='A'; dh<=c;dh++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		//logic 2
		int cout=0;
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < col; j++) {
		System.out.print((char)(cout+65)+" ");
		cout++;
		}
		System.out.println();
	}
		
		System.out.println();
		System.out.println();
		
		/*
		 Z Y X W V
		 U T S R Q
		 P O N M L
		 K J I H G
		 F E D C B 
		 */
		//logic 1
		char kt = 'Z';
		for(char ch='A'; ch<=r;ch++) {
			for(char dh='A'; dh<=c;dh++) {
				System.out.print(k+" ");
				k--;
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
	
		//logic 2
		int ct=0;
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < col; j++) {
		System.out.print((char)(90-ct)+" ");
		ct++;
		}
		System.out.println();
	}
		
		System.out.println();
		System.out.println();

		
}
	
}
		