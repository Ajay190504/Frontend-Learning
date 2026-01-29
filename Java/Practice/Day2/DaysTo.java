package day2;

public class DaysTo {
    public static void main(String[] args) {
        int days = 5; // Example input

        //days to hours
        int hours = days * 24;

        //days to minutes
        int minutes = days * 1440;

        //days to seconds
        int seconds = days * 86400;

        //days to weeks
        int weeks = days / 7;
        
        //days to months (approximate 30 days per month)
        int months = days / 30;

        //days to years (approximate 365 days per year)
        int years = days / 365;

        //years to days
        int daysFromYears = years * 365;

        //months to days
        int daysFromMonths = months * 30;

        //weeks to days
        int daysFromWeeks = weeks * 7;

        //hours to days
        int daysFromHours = hours / 24;

        //minutes to days
        int daysFromMinutes = minutes / 1440;

        //seconds to days
        int daysFromSeconds = seconds / 86400;

        //display each conversion

        System.out.println(days + " days is equal to " + hours + " hours.");
        System.out.println(days + " days is equal to " + minutes + " minutes.");
        System.out.println(days + " days is equal to " + seconds + " seconds.");
        System.out.println(days + " days is equal to " + weeks + " weeks.");
        System.out.println(days + " days is equal to " + months + " months.");
        System.out.println(days + " days is equal to " + years + " years.");
        System.out.println(years + " years is equal to " + daysFromYears + " days.");
        System.out.println(months + " months is equal to " + daysFromMonths + " days.");
        System.out.println(weeks + " weeks is equal to " + daysFromWeeks + " days.");
        System.out.println(hours + " hours is equal to " + daysFromHours);
        System.out.println(minutes + " minutes is equal to "+ daysFromMinutes);
        System.out.println(seconds + " seconds is equal to "+ daysFromSeconds);
    }
}