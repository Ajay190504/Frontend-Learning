package day3;
/*
22. Write a Java program to accept 10 numbers and count how many are positive, negative, 
or zero. 
23. Write a Java program to accept 10 numbers and find the largest and smallest among 
them.
*/
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 5;
		int fact = 1;
		if(num==1 || num==0) {
			System.out.println("Factorial : "+fact);
		}
		else {
		for(int i=num;i>1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial : "+fact);
		}
	}

}
