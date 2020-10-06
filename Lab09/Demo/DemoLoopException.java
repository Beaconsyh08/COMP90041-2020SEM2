/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoLoopException {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number = 0; //to keep compiler happy
        boolean done = false;

        while (!done) {
            try {
                System.out.println("Enter a whole number:");
                number = keyboard.nextInt(); // a

                done = true;

            } catch (InputMismatchException e) {
                System.out.println(keyboard.nextLine());  // ***
                System.out.println("Not a correctly written whole number.");
                System.out.println("Try again.");
            }
        }
        System.out.println("You entered " + number);
    }
}

 
