import java.util.Scanner;

public class CodingStyleSample {
    public static final int STONE_UPPERBOUND = 3;

    public static void main(String[] args) {
        int numberOfStones, numberToRemove;
        // Good variable names
        int a, b, c; // Bad variable names
        int i = 10;
        int upperBound = 10000;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Nim");
        System.out.println();
        System.out.println("Please enter initial number of stones:");
        // Lack of whitespace in the piece of code above, that is, there is no space between lines at all.

        numberOfStones = keyboard.nextInt();

        // Use of magic number
        while (numberOfStones > 10)
        { // Inconsistent braces
            System.out.println();
            System.out.print(numberOfStones + " stones left:");

            printStones(numberOfStones);

    // Bad indentation
    System.out.println("Remove how many?");
                    numberToRemove = keyboard.nextInt();
numberOfStones -= numberToRemove;

        }
        System.out.println();
        System.out.println("Game Over");
    }

    // Good method name
    public static void printStones(int numberOfStones) {
        int i;
        for (i = 1; i <= numberOfStones; i++) {
            System.out.print(" *");
        }
        System.out.print("\n");
    }

    // Bad method name
    public int functionA() {
        return 0;
    }
}
