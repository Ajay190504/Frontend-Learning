package day1;

public class LargestOfThree {
	
	public static void main(String[] args) {
		int num1=10,num2=12,num3=8;
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1+" is Largest");
			}
			else {
				System.out.println(num3+" is Largest");
			}
			
		}
		else if(num2>num3) {
			System.out.println(num2+" is Largest");
		}
		else if((num1==num2) && (num2==num3)) {
			System.out.println("All are equal");
		}
		
		else {
			System.out.println(num3+" is Largest");
		}
	}

}
