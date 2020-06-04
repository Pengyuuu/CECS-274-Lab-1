/* Author: Eric Truong
 * Date: August 26, 2019
 * Description: Generate a number between 1 and 100 and have the user guess it
 */

import java.util.Scanner;

public class GuessingGame {

    public static void main (String[] args) {

        // set the maximum and minimum number generated
        final int UPPER_BOUND = 100;
        final int LOWER_BOUND = 1;

        // formula for the random method to generate a number between 1 and 100
        int rand = (int) ((Math.random() * (UPPER_BOUND - LOWER_BOUND + 1) ) + LOWER_BOUND);

        System.out.print("I'm thinking of a number. Guess a value (1-100): ");

        // creates a counter
        int usertries = 0;

        // set a variable so loop begins
        int usernumber = -1;

        // loop to ask user input as long as it's incorrect
        while (usernumber != rand) {

            // check to see if user input is negative or includes a character
            usernumber = CheckInput.getIntRange(1, 100);


            // occurs if user's number is higher or lower
            if (usernumber < rand) {
                System.out.println("Number is too low. Guess again: ");
                usertries++;


            }
            else if (usernumber > rand) {
                System.out.println("Number is too high. Guess again: ");
                usertries++;


            }
            else if (usernumber == rand) {
                usertries++;
                System.out.print("Correct! You got it in " + usertries + " tries!");

            }

        }

    }
}
