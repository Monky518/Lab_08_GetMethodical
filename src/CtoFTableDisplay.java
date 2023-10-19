public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        // C to F Data Display:
        //  Note this is similar to a program we wrote previously, but now you use a method to compute the converted temperature instead of inlining the code in the loop
        //
        // Create a static method that takes a Celsius value (Java double) and returns the equivalent Fahrenheit value as a double
        //
        // public static double CtoF(double Celsius)
        //
        // This is a one-off method so place it in the same file as your program code
        // Note that you place it outside and after main within the class body
        //  Now code a program that creates a tabular display of two columns with the Celsius value on the left and the equivalent Fahrenheit value on the right
        //  The table should show degrees centigrade in 1 degree increments from -100 to 100

        // | C | F |
        // -100C to 100C
        for (double c = -100.00; c <= 100.00; c++)
        {
            System.out.printf("| %7.2f |", c);
            System.out.printf(" %7.2f |", CtoF(c));
            System.out.print("\n");
        }
    }

    public static double CtoF(double Celsius)
    {
        return (Celsius * 1.8) + 32;
    }
}
