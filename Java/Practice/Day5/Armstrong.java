package day5;

public class Armstrong {

    public static void main(String[] args) {

        int num = 8208;
        int org1 = num;
        int count = 0;
        int sum = 0;

        while (org1 != 0) {
            org1 = org1 / 10;
            count++;
        }

        org1=num;
        
        while (org1 != 0) {

            int rem = org1 % 10;
            int power = 1;
            int i = 1;
            while (i <= count) {
                power = power * rem;  
                i++;
            }

            sum = sum + power;
            org1 = org1 / 10;
        }

        if (num == sum) {
            System.out.println(num + " is an Armstrong Number");
        } else {
            System.out.println(num + " is not an Armstrong Number");
        }
    }
}
