/**
 * Question3DivideInMethod.java
 * <p>
 * This program exercises the use of multiple Catch blocks in
 * main and the addition of an exception to a method.  Finally,
 * it uses a custom class derived from Exception.
 * <p>
 * Created: Sat Mar 19 2005
 *
 * @author Kenrick Mock
 * @version 1
 */

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class is used to represent a division by zero exception
 */
class DivideByZeroException extends Exception {
    public DivideByZeroException() {
        super("Divide by zero.");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
} // DivideByZeroException

/**
 * Exercise in catching an exception in a method.
 */
class Question3DivideInMethod {
    public static double ReturnRatio()
            throws DivideByZeroException, InputMismatchException {
        Scanner scan = new Scanner(System.in);
        int n1, n2;

        System.out.println("Enter two numbers.  I will compute the ratio.");
        n1 = scan.nextInt();    // Throws InputMismatchException if one occurs
        n2 = scan.nextInt();    // Throws InputMismatchException if one occurs
        if (n2 == 0) {
            throw new DivideByZeroException();
        }
        return (double) n1 / n2;
    }

    public static void main(String[] args) {
        double r = 0;
        boolean error;

        do {
            error = false;                // Assume no error
            try {
                r = ReturnRatio();
            } catch (InputMismatchException e) {
                error = true;            // Set error flag to true to repeat again
                System.out.println("You must enter an integer.  Try again.");
            } catch (DivideByZeroException e) {
                error = true;            // Set error flag to true to repeat again
                System.out.println("There was a divide exception: " + e.getMessage() + ". Try again.");
            } catch (Exception e)        // Catch some other Exception
            {
                error = true;            // Set error flag to true to repeat again
                System.out.println("There was an exception: " + e.getMessage() + ".  Try again.");
            }
        } while (error);

        System.out.println("The ratio r = " + r);
    }
} // Question3DivideInMethod