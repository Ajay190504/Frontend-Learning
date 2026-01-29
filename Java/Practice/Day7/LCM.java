package day7;

public class LCM {

	public static void main(String[] args) {

		int num1 = 12, num2=22;
		int hcf = 0;
		int lcm = 0;
		
		//Method 1: By definition
		if(num1<num2) {
			for(int i=1; i<=num1; i++) {
				if(num1%i==0 && num2%i==0) {
					hcf = i;
				}
			}
		}
		
		else {
			for(int i=1; i<=num2; i++) {
				if(num1%i==0 && num2%i==0) {
					hcf = i;
				}
			}
		}
		
		lcm = (num1*num2)/hcf;
		
		System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
	
	//Method 2: Eucladian Formula
		int a=num1, b=num2;
		while(b!=0) {
			int temp=b;
			b=a%b;
			a=temp;
		}
		
		lcm = (num1*num2)/a;
		System.out.println("HCF of "+num1+" and "+num2+" is "+a);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		
		//Method 3: By 2nd formula of lcm
		int div = 1;
		while (a>=div && b>=div) {
		    if (a % div == 0 && b % div == 0) {
		        
		        a = a / div;
		        b = b / div; 
		        hcf = hcf * div;
		        
		    } else {
		        div++;
		    }
		    lcm= a*b*hcf;
		}
		
		System.out.println("HCF of "+num1+" and "+num2+" is "+hcf);
		System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
		
	}

}
