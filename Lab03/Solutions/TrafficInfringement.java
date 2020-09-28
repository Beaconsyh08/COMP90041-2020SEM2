/*
   The University of Melbourne
   School of Computing and Information Systems
   COMP90041 Programming and Software Development
*/

import java.util.Scanner;

class TrafficInfringement {

    public static void main(String[] args) {
        // Try to not use magic number, declare and initial them, that will make the maintenance much easier
        final int SPEED_LIMIT = 60, RANGE1_LOW = 60, RANGE1_HIGH = 65, RANGE2_LOW = 65, RANGE2_HIGH = 70, RANGE3_LOW = 70,
                FINE_STEP1 = 5, FINE_STEP2 = 7, FINE_STEP3 = 10, FINE_STEP4 = 15;
        double speed;
        boolean drunk;
        double fine = 0.0;
        String message;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter speed: ");
        speed = keyboard.nextDouble();

        System.out.print("Is the driver drunk? ('Y' for drunk, 'N' otherwise): ");

        // next read the next string, and charAt function could select the specific char
        drunk = keyboard.next().toUpperCase().charAt(0) == 'Y';

        if (speed > RANGE1_LOW && speed < RANGE1_HIGH && !drunk) {
            message = "Warning";
        } else if (speed > RANGE1_LOW && speed < RANGE1_HIGH && drunk) {
            message = "Warning + Take a shower";
        } else if (speed > RANGE2_LOW && speed <= RANGE2_HIGH && !drunk) {
            message = "$" + FINE_STEP1 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
            fine = (speed - SPEED_LIMIT) * FINE_STEP1;
        } else if (speed > RANGE2_LOW && speed <= RANGE2_HIGH && drunk) {
            message = "$" + FINE_STEP2 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
            fine = (speed - SPEED_LIMIT) * FINE_STEP2;
        } else if (speed > RANGE3_LOW && !drunk) {
            message = "$" + FINE_STEP3 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr";
            fine = (speed - SPEED_LIMIT) * FINE_STEP3;
        } else if (speed > RANGE3_LOW && drunk) {
            message = "$" + FINE_STEP4 + " fine for each km/hr over " + SPEED_LIMIT + " km/hr" +
                    "\n\nSpend the day/night in cell until become sober.";
            fine = (speed - SPEED_LIMIT) * FINE_STEP4;
        } else {
            message = "All good!";
            fine = 0.0;
        }

        System.out.println("\n****************************************************");
        System.out.println(message + "\n");
        System.out.println("----------------------------------------------------");
        System.out.println("You have a fine of $" + fine);
        System.out.println("****************************************************");
    }
}