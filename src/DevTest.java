import java.util.Scanner;

public class DevTest
{
    public static Scanner testScan = new Scanner(System.in);

    public static void main(String[] args)
    {
        String firstName = "";
        int age = 0;
        double salary = 0.0;
        int favNum = 0;
        boolean enter = false;
        String ssnRegEx = "^\\d{3}-\\d{2}-\\d{4}$";
        String ssn = "";

    /*
        firstName = getNonZeroLenString(testScan, "Enter your first name");
        System.out.println("Your first name is " + firstName);

        age = getInt(testScan, "Enter your age");
        System.out.println("You said your age is: " + age);

        salary = getDouble(testScan, "Enter your salary");
        System.out.println("You said your salary is: " + salary);

        favNum = getRangedInt(testScan, "Enter you favorite number", 1, 10);
        System.out.println("You said your fav num is: " + favNum);

        salary = getRangedDouble(testScan, "Enter your salary", 300, 100000);
        System.out.println("You said your salary is: " + salary);

        enter = getYNConfirm(testScan, "Do you want to enter?");
        System.out.println("You said: " + enter);

     */

        ssn = getRegExString(testScan, "Enter a fake SSN", ssnRegEx);
        System.out.println("You said your fake SSN is: " + ssn);
    }

    /**
     * returns a String input by the user that must be at least one character
     * @param pipe the scanner to use for the input
     * @param prompt the message for the user telling them what to input
     * @return a String of at least one character
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        boolean done = false;
        String response = "";

        do
        {
            System.out.print(prompt + ": ");
            response = pipe.nextLine();
            if (response.length() > 0)
            {
                done = true;
            }
            else
            {
                System.out.println("\nYou must enter at least one character!\n");
            }
        } while(!done);

        return response;
    }

    /**
     * gets an int value from the user with no constraints
     * @param pipe Scanner to use for the input
     * @param prompt message to user for what to enter
     * @return any valid int
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); //clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered " + trash + ", which is not a number!\n");

            }
        } while(!done);

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt + ": ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); //clear the buffer
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered " + trash + ", which is not a number!\n");
            }
        } while(!done);

        return value;
    }

    /**
     * gets an int val from the user with no constraints
     * @param pipe Scanner to user for the input
     * @param prompt msg to user for what to enter
     * @param low the bottom value for the inclusive range
     * @param high the top value for the inclusive range
     * @return valid input from high to low
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        boolean done = false;
        String trash = "";
        int value = 0;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                value = pipe.nextInt();
                pipe.nextLine(); //clear the buffer
                if(value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nYou entered " + value + ", which is not a part of the range!\n");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered " + trash + ", which is not a number!\n");

            }
        } while(!done);

        return value;
    }

    /**
     * gets a double val with in an inclusive range
     * @param pipe Scanner to user for the input
     * @param prompt msg to user for what to enter
     * @param low the bottom bound for the inclusive range
     * @param high the top bound for the inclusive range
     * @return valid double input from high to low range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        boolean done = false;
        String trash = "";
        double value = 0;

        do
        {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                value = pipe.nextDouble();
                pipe.nextLine(); //clear the buffer
                if(value >= low && value <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nYou entered " + value + ", which is not a part of the range!\n");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("\nYou entered " + trash + ", which is not a number!\n");
            }
        } while(!done);

        return value;
    }

    public static boolean getYNConfirm (Scanner pipe, String prompt)
    {
        boolean done = false;
        boolean retVal = false;
        String response = "";

        do
        {
            System.out.print(prompt + "[Y N]: ");
            response = pipe.nextLine();
            if (response.toUpperCase().matches("[YN]"))
            {
                done = true;
                if (response.equalsIgnoreCase("Y"))
                {
                    retVal = true;
                }
                else //response == N
                {
                    retVal = false;
                }
            }
            else
            {
                System.out.println("\nYou must enter yes or no! [Y N]\n");
            }
        } while(!done);

        return retVal;
    }

    /**
     * takes a regEx String and returns a valid match from the user
     * @param pipe scanner to use for input
     * @param prompt msg to user telling them what is needed for input
     * @param regEx a String that represents a Regular Expression to use for the test
     * @return a String value that matches the Regular Expression
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        boolean done = false;
        String response = "";

        do
        {
            System.out.print(prompt + " " + regEx + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx))
            {
                done = true;
            }
            else
            {
                System.out.println("\nYou must enter a String that matches the pattern" + regEx + "!\n");
            }
        } while(!done);

        return response;
    }
}