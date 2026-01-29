package day3;

public class evenSeries {
	public static void main(String[] args) {
		
		// 2 4 6 8 10 ...
		//mult by 2
//		for(int i=1; i<=10; i++) {
//			System.out.print(2*i +" ");
//		}
//		
//		System.out.println();
//		
//		//filtering even
//		for(int i=1;i<=20;i++) {
//			if((i&1)==0) {
//				System.out.print(i+" ");
//			}
//		}
//		
//		System.out.println();
//		
//		// adding 2
//		for(int i=2;i<=20;i+=2) {
//			System.out.print(i+" ");
//		}
//		
//		System.out.println();
//		
//		//more
//		for(int i=1; i<=10; i++) {
//			System.out.print(i+i + " ");
//		}
//		
//		System.out.println();
		
		// 3 6 9 12 15 18 21 24 27 30
		//mult by 3
		for(int i=1; i<=10; i++) {
			System.out.print(3*i +" ");
		}
		
		System.out.println();
		
		//filtering even
		for(int i=1;i<=30;i++) {
			if((i%3)==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		// adding 3
		for(int i=3;i<=30;i+=3) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//more
		for(int i=1; i<=10; i++) {
			System.out.print(i+i+i + " ");
		}
		
		
	}
}
