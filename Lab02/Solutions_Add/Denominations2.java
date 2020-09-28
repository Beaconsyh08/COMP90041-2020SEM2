/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturer: Dr Tilman Dingler, Dr Thuan Pham
   Semester 2, 2020, Week 3
   Workshop Sample Solution
   Copyright The University of Melbourne 2020
*/

/* Program to display the denominations of change for a Point-of-Sale System
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

import java.util.Scanner;

public class Denominations2 {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        final double EPSILON = 0.04;

        // variables to store the change and amount left to be paid.		
        double change;

        System.out.print("Please enter the change (without $): ");
        change = scanner.nextDouble();
        change += EPSILON;

        System.out.println("Please give the customer: ");
        System.out.println("$50\t" + (int) (change / 50));
        change %= 50;
        System.out.println("$20\t" + (int) (change / 20));
        change %= 20;
        System.out.println("$10\t" + (int) (change / 10));
        change %= 10;
        System.out.println("$5\t" + (int) (change / 5));
        change %= 5;
        System.out.println("$2\t" + (int) (change / 2));
        change %= 2;
        System.out.println("$1\t" + (int) (change / 1));
        change %= 1;
        System.out.println("50c\t" + (int) (change / 0.5));
        change %= 0.5;
        System.out.println("20c\t" + (int) (change / 0.2));
        change %= 0.2;
        System.out.println("10c\t" + (int) (change / 0.1));
        change %= 0.1;
        System.out.println("5c\t" + (int) (change / 0.05));
    }
}
