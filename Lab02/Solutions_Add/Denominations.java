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

public class Denominations {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        // in case the change is less than the actual amount. If the actual change is 165.96, if we do not add this 0.04,
        // the customer will only get 165.95. But it could not be larger than 0.05, in that case, if the actual change
        // is 166, then, the system will give customer one more 5 cent.
        final double EPSILON = 0.04;
        // variables to store the change and amount left to be paid.
        double change;

        // keep track of notes
        int fifties, twenties, tens, fives, twos, ones;

        // keep track of coins
        int fifty_cents, twenty_cents, ten_cents, five_cents;

        System.out.print("Please enter the change (without $): ");
        change = scanner.nextDouble();

        // to tackle any rounding off errors
        change += EPSILON;

        fifties = (int) (change / 50);
        change %= 50;

        twenties = (int) (change / 20);
        change %= 20;

        tens = (int) (change / 10);
        change %= 10;

        fives = (int) (change / 5);
        change %= 5;

        twos = (int) (change / 2);
        change %= 2;

        ones = (int) (change / 1);
        change %= 1;

        fifty_cents = (int) (change / 0.5);
        change %= 0.5;

        twenty_cents = (int) (change / 0.2);
        change %= 0.2;

        ten_cents = (int) (change / 0.10);
        change %= 0.10;

        five_cents = (int) (change / 0.05);
        change %= 0.05;

        System.out.println("Please give the customer: ");
        System.out.println("$50\t" + fifties);
        System.out.println("$20\t" + twenties);
        System.out.println("$10\t" + tens);
        System.out.println("$5\t" + fives);
        System.out.println("$2\t" + twos);
        System.out.println("$1\t" + ones);
        System.out.println("50c\t" + fifty_cents);
        System.out.println("20c\t" + twenty_cents);
        System.out.println("10c\t" + ten_cents);
        System.out.println("5c\t" + five_cents);
    }
}
