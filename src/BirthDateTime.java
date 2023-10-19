import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        // Use the getRangedInt method to input:
        // the year (1950-2015)
        // month (1-12)
        // Day*
        // hours (1–24)
        // Minutes (0-59)
        //
        // Note: Use a switch() conditional selector structure to limit the user to the correct number of days for the month they were born in
        // For instance if they were born in Feb [1-29], Oct [1-31]
        // HINT: there are only 3 groups here not 12 different ones!

        Scanner scan = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int min = 0;

        year = SafeInput.getRangedInt(scan, "Enter your birth year", 1950, 2015);
        month = SafeInput.getRangedInt(scan, "Enter your birth month", 1, 12);
        switch (month)
        {
            case 2:
                day = SafeInput.getRangedInt(scan, "Enter your birth day", 1, 29);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = SafeInput.getRangedInt(scan, "Enter your birth day", 1, 30);
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(scan, "Enter your birth day", 1, 31);
                break;
        }
        hour = SafeInput.getRangedInt(scan, "Enter your birth hour", 1, 24);
        min = SafeInput.getRangedInt(scan, "Enter your birth minute", 0, 59);
        System.out.println("You were born on month " + month + ", day " + day + ", year " + year + " at the " + hour + " hour and " + min + " minute");
    }
}
