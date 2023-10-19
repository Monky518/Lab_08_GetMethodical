import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        // At the 10$ store nothing is more than $10.00
        // Prompt the user for the price of their item (.50 cents to $10.00 dollars) using the getRangedDouble method
        // Continue to input items as long as they indicate that they have more using your getYNConfirm method
        // Display the total cost of the item(s) to 2 decimal places with printf

        Scanner scan = new Scanner(System.in);
        boolean goAgain = false;
        double total = 0.0;

        do
        {
            total = total + SafeInput.getRangedDouble(scan, "Enter the item cost", 0.50, 10.00);
            goAgain = SafeInput.getYNConfirm(scan, "Do you have another item?");
        } while(goAgain);

        System.out.printf("Your total is: %.2f", total);
    }
}
