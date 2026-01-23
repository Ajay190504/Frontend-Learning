package com.allpract.type2;
//Type 2: Methods with return type and without parameters
public class MethodsWithReturnNoParams {
	
	//1) Check Prime No Method
	boolean isPrime() {
		
		int num=23;
		
		for(int i=2;i<=((num/2)+1);i++) {
			
			if(num%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	//2) Check number is even or not
	boolean isEven() {
		int num=21;
		if(num%2!=0) {
			return false;
		}
		return true;
		
	}
	//3) Check Armstrong No Method
	boolean  isArmstrong() {
		
		int num=153;
		int temp=num;
		int out=0;
		
		//count no. of digits
		int count = 0;
		
		while(temp!=0) {
			count++;
			temp/=10;
		}
		temp=num;
		
		//seperate digit and find out
		while(temp!=0) {
			int dig = temp%10;	//seperate digit
			int i=1;
			int pow=1;
			//Calculate digit raised to count
			while(i<=count) {
				pow*=dig;
				i++;
			}
			out+=pow;  //add pow to out
			temp=temp/10;	//reduce unit digit from temp
		}
		//Check if out same to original num
		if(num==out) {
		return true;
		}
		else {
			return false;
		}
	}
	
	//4) Reversed number
	int getReversed() {
		int num = 12345;
		int rev = 0;
		
		while(num!=0) {
			int dig = num%10;
			rev=(rev*10)+dig;
			num/=10;
		}
		return rev;
	}
	
	//5) Average of 3 numbers
	float getAverage() {
		float avg=0.0f;
		int a=5, b=6, c=8;
		avg=(a+b+c)/3.0f;
		return avg;
	}
	
	//6) Get grade based on marks
	char getGrade() {
	    int marks = 92;
	    if (marks >= 90) {
	    	return 'A';
	    }
	    else if (marks >= 75) {
	    	return 'B';
	    }
	    else if (marks >= 60) {
	    	return 'C';
	    }
	    else {
	    	return 'D';
	    }
	}
	
	//7) Find factorial of a number
	long getFactorial() {
		int num=16;
		long fact=1l;
		for(int i=num;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
	}
	
	//8) Find simple interest
	float getSimpleInterest() {
	    float p = 1000, r = 5, t = 2;
	    return (p * r * t) / 100;
	}
	
	//9) Check if Palindrome or not
	String checkPalindrome() {
	    int num = 121;
	    int rev = 0;
	    int temp = num;
	    while (temp != 0) {
	    	int dig=temp%10;
	        rev = rev * 10 + dig;
	        temp /= 10;
	    }
	    
	    if(num==rev) {
	    	return "Palindrome";
	    }
	    else {
	    	return "Not Palindrome";
	    }
	}
	
	// Get area of circle
	double getAreaOfCircle() {
		
		double radius = 5.3239285693;
		return (3.14*radius*radius);
		
	}

	

}

