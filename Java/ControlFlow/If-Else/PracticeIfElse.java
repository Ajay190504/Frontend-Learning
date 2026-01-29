package ifElse;

public class PracticeIfElse {
    public static void main(String[] args) {
        int number = 10;

        
        //Accept a number and check whether it is a multiple of 5 and 11 or not.
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println(number + " is a multiple of both 5 and 11.");
        } else {
            System.out.println(number + " is not a multiple of both 5 and 11.");
        }

        /* Accept a person's salary and apply tax:
            Salary < 50,000 → No Tax
            50,000 to 1,00,000 → 10% Tax
            Above 1,00,000 → 20% Tax */

        double salary = 75000;
        double tax;
        if (salary < 50000) {
            tax = 0;
        } else if (salary <= 100000) {
            tax = salary * 0.10;
        } else {
            tax = salary * 0.20;
        }

        //Accept three sides of a triangle and check whether it is valid or not (sum of any two sides > third side).
        int side1 = 5, side2 = 7, side3 = 10;
        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }

        //Accept a character and check if it is uppercase, lowercase, digit, or special character.
        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a digit.");
        } else {
            System.out.println(ch + " is a special character.");
        }

        //Accept a number and check if it is a perfect square or not.
        int num = 16;
        double sqrt = Math.sqrt(num);
        if (sqrt == Math.floor(sqrt)) {
            System.out.println(num + " is a perfect square.");
        } else {
            System.out.println(num + " is not a perfect square.");
        }

        /* Accept time in 24-hour format and print:
        0–11 → Good Morning
        12–16 → Good Afternoon
        17–20 → Good Evening
        21–23 → Good Night  */
        int hour = 14;
        if (hour >= 0 && hour <= 11) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour <= 16) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour <= 20) {
            System.out.println("Good Evening");
        } else if (hour >= 21 && hour <= 23) {
            System.out.println("Good Night");
        } else {
            System.out.println("Invalid hour input.");
        }

        //Accept two numbers and print which number is nearest to 100.
        int num1 = 95, num2 = 105;
        int diff1 = 100 - num1;
        int diff2 = 100 - num2;
        if (diff1 < diff2) {
            System.out.println(num1 + " is nearer to 100.");
        } else if (diff2 < diff1) {
            System.out.println(num2 + " is nearer to 100.");
        } else {
            System.out.println("Both numbers are equally near to 100.");
        }

        //Accept the cost price and selling price; print Profit, Loss, or No Profit No Loss.
        int costPrice = 5000;
        int sellingPrice = 6000;
        if (sellingPrice > costPrice) {
            System.out.println("Profit");
        } else if (costPrice > sellingPrice) {
            System.out.println("Loss");
        } else {
            System.out.println("No Profit No Loss");
        }

        /* Accept age and gender:
        If age > 60 and gender = 'F' → "Senior Woman Citizen"
        If age > 60 and gender = 'M' → "Senior Man Citizen"
        Else → "Not a Senior Citizen" */
        int age = 65;
        char gender = 'F';      
        if (age > 60 && gender == 'F') {
            System.out.println("Senior Woman Citizen");
        } else if (age > 60 && gender == 'M') {
            System.out.println("Senior Man Citizen");
        } else {
            System.out.println("Not a Senior Citizen");
        }

        //Accept a month number (1â€“12) and check if it belongs to summer, rainy, or winter season.
        int month = 7;
        if (month == 3 || month == 4 || month == 5) {
            System.out.println("Summer Season");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Rainy Season");
        } else if (month == 9 || month == 10 || month == 11 || month == 12 || month == 1 || month == 2) {
            System.out.println("Winter Season");
        } else {
            System.out.println("Invalid month number.");
        }
    }
}