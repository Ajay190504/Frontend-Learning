package day2;

public class TimeConvert {
    public static void main(String[] args) {
        int totalMinutes = 130; // Example input

        //minutes to hours
        int hours = totalMinutes / 60;


        //minutes to seconds
        int seconds = totalMinutes * 60;

        //hours to minutes
        int totalMinutesInHours = hours * 60;

        //hours to seconds
        int totalSecondsInHours = hours * 3600;

        //seconds to minutes
        int minutes = seconds / 60;

        //seconds to hours
        int hoursFromSeconds = seconds / 3600;

        //hours to days
        int days = hours / 24;

        //days to hours
        int hoursFromDays = days * 24;

        //days to minutes
        int minutesFromDays = days * 1440;

        //days to seconds
        int secondsFromDays = days * 86400;

        System.out.println(totalMinutes + " minutes is equal to " + hours + " hours and " + minutes + " minutes.");

        //display each conversion
        System.out.println(totalMinutes + " minutes is equal to " + seconds + " seconds.");
        System.out.println(hours + " hours is equal to " + totalMinutesInHours + " minutes.");
        System.out.println(hours + " hours is equal to " + totalSecondsInHours + " seconds.");
        System.out.println(seconds + " seconds is equal to " + minutes + " minutes.");
        System.out.println(seconds + " seconds is equal to " + hoursFromSeconds + " hours.");
        System.out.println(hours + " hours is equal to " + days + " days.");
        System.out.println(days + " days is equal to " + hoursFromDays + " hours.");
        System.out.println(days + " days is equal to " + minutesFromDays + " minutes.");
        System.out.println(days + " days is equal to " + secondsFromDays + " seconds.");
        
    }
}