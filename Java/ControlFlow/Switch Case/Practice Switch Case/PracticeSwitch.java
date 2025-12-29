public class PracticeSwitch {
    public static void main(String[] args) {
        //Accept a day number (1–7) and print the day name (Monday to Sunday) using switch case.
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);

        //Accept a grade (A, B, C, D, F) and print the remark using switch case.
        char grade = 'B';
        String remark;
        switch (grade) {
            case 'A':
                remark = "Excellent";
                break;
            case 'B':
                remark = "Good";
                break;
            case 'C':
                remark = "Average";
                break;
            case 'D':
                remark = "Below Average";
                break;
            case 'F':
                remark = "Fail";
                break;
            default:
                remark = "Invalid grade";
        }
        System.out.println("The remark is: " + remark);

        //Accept a month number (1–12) and print how many days the month has.

        int month = 2;  
        int daysInMonth;

        switch (month) {
            case 1:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28; // Assuming non-leap year
                break;
            case 3:
                daysInMonth = 31;
                break;
            case 4:
                daysInMonth = 30;
                break;
            case 5:
                daysInMonth = 31;
                break;
            case 6:
                daysInMonth = 30;
                break;
            case 7:
                daysInMonth = 31;
                break;
            case 8:
                daysInMonth = 31;
                break;
            case 9:
                daysInMonth = 30;
                break;
            case 10:
                daysInMonth = 31;
                break;
            case 11:
                daysInMonth = 30;
                break;
            case 12:
                daysInMonth = 31;
                break;
            default:
                daysInMonth = 0; // Invalid month   
        }
        System.out.println("The month has: " + daysInMonth + " days");

        //Accept a character and check whether it is a vowel or consonant using switch case.
        char character = 'e';
        String type;
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                type = "Vowel";
                break;
            default:
                type = "Consonant";
        }
        System.out.println("The character is: " + type);

        // Create a simple calculator using switch case (addition, subtraction, multiplication, division).
        int num1 = 10;
        int num2 = 5;
        char operator = '+';
        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
                return; // Exit if invalid operator
        }

        System.out.println("Result: " + result);

        /* 
        Accept a number between 1–4 and print the corresponding season:
        1 → Summer
        2 → Rainy
        3 → Winter
        4 → Spring
        */
        int seasonNumber = 2;
        String season;

        switch (seasonNumber) {
            case 1:
                season = "Summer";
                break;
            case 2:
                season = "Rainy";
                break;
            case 3:
                season = "Winter";
                break;
            case 4:
                season = "Spring";
                break;
            default:
                season = "Invalid season number";
        }

        System.out.println("The season is: " + season);

        //Accept a vehicle type (Car, Bike, Bus, Truck) and print the toll tax amount using switch case.
        String vehicleType = "Bus";
        int tollTax;
        switch (vehicleType) {
            case "Car":
                tollTax = 50;
                break;
            case "Bike":
                tollTax = 20;
                break;
            case "Bus":
                tollTax = 100;
                break;
            case "Truck":
                tollTax = 150;
                break;
            default:
                tollTax = 0; // Invalid vehicle type
        }
        System.out.println("The toll tax for " + vehicleType + " is: " + tollTax);

        //Accept a color code (R, G, B, Y) and print the color name.
        char colorCode = 'G';
        String colorName;
        switch (colorCode) {
            case 'R':
                colorName = "Red";
                break;
            case 'G':
                colorName = "Green";
                break;
            case 'B':
                colorName = "Blue";
                break;
            case 'Y':
                colorName = "Yellow";
                break;
            default:
                colorName = "Invalid color code";
        }
        System.out.println("The color is: " + colorName);

        //Accept a number 1–5 and print the star pattern type (Square, Triangle, Pyramid, Diamond, Reverse Triangle).
        int patternNumber = 3;
        String patternType;

        switch (patternNumber) {
            case 1:
                patternType = "Square";
                break;
            case 2:
                patternType = "Triangle";
                break;
            case 3:
                patternType = "Pyramid";
                break;
            case 4:
                patternType = "Diamond";
                break;
            case 5:
                patternType = "Reverse Triangle";
                break;
            default:
                patternType = "Invalid pattern number";
        }

        System.out.println("The star pattern type is: " + patternType);


        /* Accept user choice (1–3):
        1 → Print “Start”
        2 → Print “Stop”
        3 → Print “Restart”
        Use switch case.
        */
        int userChoice = 2;
        String action;

        switch (userChoice) {
            case 1:
                action = "Start";
                break;
            case 2:
                action = "Stop";
                break;
            case 3:
                action = "Restart";
                break;
            default:
                action = "Invalid choice";
        }

        System.out.println("The action is: " + action);

    }
}