/*
*  The program calculates the amount of energy an object
*  moving at the speed of light can produce in joules
*
* @author  Sydney Kuhn
* @version 1.0
* @since 2022-9-23
*/

// Imports.
import java.io.Console;

/**
* This program calculates energy.
*/
final class Energy {
    /**
    * Set constant speed of light.
    */
    public static final double SPEED_OF_LIGHT = 2.998 * Math.pow(10, 8);

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Energy() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Get user input
        final Console console = System.console();
        final String userInputString = console.readLine(
            "Enter the objects mass in kilograms : ");

        /*
        * This accepts an inputted and tests it.
        */
        try {
            // Convert string to integer
            final double userInput = Integer.valueOf(userInputString);

            // Calculations
            final double energy = userInput * Math.pow(SPEED_OF_LIGHT, 2);
            System.out.println("A " + userInput
                + "kg object will produce " + energy + " joules of energy.");
        } catch (NumberFormatException ex) {
            System.out.println("Invalid Input Entered.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
