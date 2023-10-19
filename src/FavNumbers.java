import java.util.Scanner;

public class FavNumbers
{
    // Prompt the user to enter their favorite integer and then their favorite double
    // Use the unconstrained getInt and getDouble methods for this
    //
    // Really you only have two tests here, non-numeric input and valid numeric input for each method

    public static void main(String[] args)
    {
        int favInt = 0;
        double favDouble = 0.0;
        Scanner scan = new Scanner(System.in);

        favInt = SafeInput.getInt(scan, "Enter your favorite int number");
        favDouble = SafeInput.getDouble(scan, "Enter your favorite double number");

        System.out.println("You said your favorite numbers are " + favInt + " and " + favDouble);
    }
}
