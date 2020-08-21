/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development

 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

import java.util.Scanner;

public class FloatPointCalculation {
    public static void main(String[] args) {
        float numberA;
        float numberB;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please Enter Two Float Number: ");
        numberA = keyboard.nextFloat();
        numberB = keyboard.nextFloat();
        System.out.println(numberA + " + " + numberB + " = " + (numberA + numberB));
        System.out.println(numberA + " - " + numberB + " = " + (numberA - numberB));
        System.out.println(numberA + " x " + numberB + " = " + (numberA * numberB));
    }
}
