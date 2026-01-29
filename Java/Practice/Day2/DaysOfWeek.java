package day2;

//Program for Days of the week using Switch Case
import java.util.Scanner;
public class DaysOfWeek {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a number (1-7) to get the corresponding day of the week: ");
      int dayNumber = scanner.nextInt();
      String dayName;

      switch (dayNumber) {
          case 1:
              dayName = "Sunday";
              break;
          case 2:
              dayName = "Monday";
              break;
          case 3:
              dayName = "Tuesday";
              break;
          case 4:
              dayName = "Wednesday";
              break;
          case 5:
              dayName = "Thursday";
              break;
          case 6:
              dayName = "Friday";
              break;
          case 7:
              dayName = "Saturday";
              break;
          default:
              dayName = "Invalid input! Please enter a number between 1 and 7.";
      }

      System.out.println("The day is: " + dayName);
      scanner.close();
  }
}