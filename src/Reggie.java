import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        // Use your getRegExString method several times
        //  get a SSN from the user using this pattern: ^\\d{3}-\\d{2}-\\d{4}$
        //  get a UC Student M number using this pattern ^(M|m)\\d{5}$
        //  get a menu choice using this pattern ^[OoSsVvQq]$
        // these letters are mnemonics for the menu choices Open Save View Quit
        //
        // Do several test runs FOR EACH PATTERN with strings that match and fail

        Scanner scan = new Scanner(System.in);
        String ssn = "";
        String mNumber = "";
        String menuResponse = "";

        ssn = SafeInput.getRegExString(scan, "Enter your fake SSN", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(scan, "Enter your fake M number", "^(M|m)\\d{5}$");
        menuResponse = SafeInput.getRegExString(scan, "Enter a menu response", "^[OoSsVvQq]$");

        System.out.println("Your fake SSN number is: " + ssn);
        System.out.println("Your fake M number is: " + mNumber);
        if (menuResponse.matches("Oo"))
        {
            System.out.println("You entered: Open");
        }
        else if (menuResponse.matches("Ss"))
        {
            System.out.println("You entered: Save");
        }
        else if (menuResponse.matches("Vv"))
        {
            System.out.println("You entered: View");
        }
        else //menuResponse == Qq
        {
            System.out.println("You entered: Quit");
        }
    }
}
