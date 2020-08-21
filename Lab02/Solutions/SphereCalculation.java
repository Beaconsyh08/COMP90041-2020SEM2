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

public class SphereCalculation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the Radius: ");
        double radius = keyboard.nextDouble();
        System.out.println("Volume : " + 4.0 / 3.0 * Math.PI * Math.pow(radius, 3));
        System.out.println("Surface area: " + 4 * Math.PI * radius * radius);
    }
}
