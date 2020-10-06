/**
 * Question2DivideInMain.java
 * <p>
 * This program exercises the use of multiple Catch blocks in
 * main to catch a divide by zero or a text input mismatch exception.
 * <p>
 * Created: Sat Mar 19 2005
 *
 * @author Kenrick Mock
 * @version 1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Question2DivideInMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        double r = 0;
        boolean error;

        do {
            error = false;                // Assume no error
            System.out.println("Enter two numbers.  I will compute the ratio.");
            try {
                n1 = scan.nextInt();
                n2 = scan.nextInt();
                if (n2 == 0) throw new Exception("Divide by zero.");
                r = (double) n1 / n2;
            } catch (InputMismatchException e) {
                error = true;            // Set error flag to true to repeat again
                System.out.println("You must enter an integer.  Try again.");
                String s = scan.nextLine();
            } catch (Exception e) {
                error = true;            // Set error flag to true to repeat again
                System.out.println("There was an exception: " + e.getMessage() + ".  Try again.");
            }
        } while (error);

        System.out.println("The ratio r = " + r);
    }
} // Question2DivideInMain