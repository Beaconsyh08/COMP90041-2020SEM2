/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
   Lecturer: Dr Tilman Dingler, Dr Thuan Pham
   Semester 2, 2020, Week 3
   Workshop Sample Solution
   Copyright The University of Melbourne 2020
*/

/* The video game machines at your local arcade output coupons according
 * to how well you play the game. You can redeem 10 coupons for a candy bar
 * or 3 coupons for a gumball. You prefer candy bars to gumballs. Write a
 * Java program that reads the number of coupons you have and outputs how
 * many candy bars and gumballs you can get if you spend all of your coupons
 * on candy bars first, and any remaining coupons on gumballs.
 *
 * Description
 * This is not the official sample solution from the University
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

import java.util.Scanner;

public class CouponRedeemer {
    // When a variable is declared with final keyword, its value can’t be modified, essentially, a constant
    // don't worry too much for now
    private static final int PRICE_CANDYBARS = 10, PRICE_GUMBALLS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numCoupons, numCandybars, numGumballs, remainderCoupons;
        System.out.print("How many coupons do you have: ");
        numCoupons = scanner.nextInt();

        numCandybars = numCoupons / PRICE_CANDYBARS;
        remainderCoupons = numCoupons % PRICE_CANDYBARS;
        numGumballs = remainderCoupons / PRICE_GUMBALLS;
        remainderCoupons %= PRICE_GUMBALLS;

        // Using printf in this case is more elegant
        System.out.printf("With %d coupon(s) you can get %d candy bar(s) and %d gumball(s).%n",
                numCoupons, numCandybars, numGumballs);
        System.out.printf("This will leave you with %d coupon(s).%n", remainderCoupons);
    }
}
