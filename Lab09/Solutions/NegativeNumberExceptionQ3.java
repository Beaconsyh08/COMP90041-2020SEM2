/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturer: Prof. Rui Zhang
   Semester 1, 2019, Week 10
   Workshop Sample Solution
   Copyright The University of Melbourne 2018
*/
/* This class demonstrates handling the NegtiveNumberException
   Jianzhong Qi, 27 January 2015
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class NegativeNumberExceptionQ3 {

    public static void main(String[] args) {
        boolean done = false;
        Scanner keyboard = new Scanner(System.in);

        while (!done)
            try {
                System.out.print("Enter the first non-negative number: ");
                int firstNumber = keyboard.nextInt();
                if (firstNumber < 0) {
                    throw new NegativeNumberException();
                }

                System.out.print("Enter the second non-negative number: ");
                int secondNumber = keyboard.nextInt();
                if (secondNumber < 0) {
                    throw new NegativeNumberException();
                }

                // control the do-while loop
                done = true;

                System.out.print("Your numbers are ");
                System.out.println(firstNumber + " and " + secondNumber);

            } catch (NegativeNumberException e) {
                System.out.println(e.getMessage());
                System.out.println("Please enter a non-negative integer.");
            } catch (InputMismatchException e) {
                keyboard.nextLine(); // junk string, important to include in a loop
                System.out.println("Please enter a integer.");
            }
    }
}
