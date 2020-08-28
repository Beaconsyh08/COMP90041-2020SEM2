/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
*/

import java.util.Scanner;

/**
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

public class Temperatures {
    // update via ide
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // variables to store temperatures
        int temp1, temp2, temp3, temp4, temp5;

        // read temperatures for each day`
        temp1 = askTemp("Monday", keyboard);
        temp2 = askTemp("Tuesday", keyboard);
        temp3 = askTemp("Wednesday", keyboard);
        temp4 = askTemp("Thursday", keyboard);
        temp5 = askTemp("Friday", keyboard);

        // print a histogram showing the daily temperatures
        System.out.println("\nHistogram of Temperatures");
        System.out.println("--------------------------");

        // "\t" is amazing, right?
        // "\t" can complete the current length to an integer multiple of 4 (add at least one)
        // Java String format method
        System.out.print("Monday\t\t| ");
        printStars(temp1);

        System.out.print("Tuesday\t\t| ");
        printStars(temp2);

        System.out.print("Wednesday\t| ");
        printStars(temp3);

        System.out.print("Thursday\t| ");
        printStars(temp4);

        System.out.print("Friday\t\t| ");
        printStars(temp5);

    }

    private static void printStars(int numStars) {
        for (int i = 0; i < numStars; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    private static int askTemp(String day, Scanner keyboard) {
        System.out.printf("Please enter temperature for %s: %n", day);
        return keyboard.nextInt();
    }
}
