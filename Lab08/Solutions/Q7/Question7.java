package Solutions.Q7;
/**
 * Question7.java
 * <p>
 * Created: Fri Jan 09 20:07:48 2004
 * Modified: Sat Mar 19 2005, Kenrick Mock
 *
 * @author Adrienne Decker
 * @version 2
 */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {

        MultiItemSale ms1 = new MultiItemSale();

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.println("Enter S for a sale, D for discounted sale or Q to quit");
            String first = keyboard.nextLine();
            if (first.charAt(0) == 'Q' || first.charAt(0) == 'q') {
                break;
            } // end of if ()
            else if (first.charAt(0) == 'S' || first.charAt(0) == 's') {
                System.out.println("Enter name of item: ");
                String item = keyboard.nextLine();
                if (item == null) {
                    System.err.println("Null string");
                    System.exit(1);
                } // end of if ()

                System.out.println("Enter item's price: ");
                double temp = keyboard.nextDouble();
                keyboard.nextLine();  // Eat newline
                if (temp < 0) {
                    System.err.println("Negative price.");
                    System.exit(1);
                } // end of if ()

                Sale s1 = new Sale(item, temp);
                ms1.insertSale(s1);
            } // end of if ()

            else if (first.charAt(0) == 'D' || first.charAt(0) == 'd') {
                System.out.println("Enter name of item: ");
                String item = keyboard.nextLine();
                if (item == null) {
                    System.err.println("Null string");
                    System.exit(1);
                } // end of if ()

                System.out.println("Enter item's price: ");
                double temp = keyboard.nextDouble();
                keyboard.nextLine();  // Eat newline
                if (temp < 0) {
                    System.err.println("Negative price.");
                    System.exit(1);
                } // end of if ()

                System.out.println("Enter percentage discount as a double.\nFor example 6.5 for 6.5%");
                double tempDis = keyboard.nextDouble();
                keyboard.nextLine();  // Eat newline
                if (tempDis < 0) {
                    System.err.println("Negative discount.");
                    System.exit(1);
                } // end of if ()

                DiscountSale d1 = new DiscountSale(item, temp, tempDis);
                ms1.insertSale(d1);
            } // end of else
        }

        System.out.println("Total bill: $" + ms1.computeTotal());

    }
} // Question7