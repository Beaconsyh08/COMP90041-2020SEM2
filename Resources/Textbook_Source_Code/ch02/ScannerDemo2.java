
import java.util.Scanner;

public class ScannerDemo2
{
    public static void main(String[] args)
    {
        int n1, n2;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter two whole numbers");
        System.out.println("seperated by one or more spaces:");

        n1 = scannerObject.nextInt( );
        n2 = scannerObject.nextInt( );
        System.out.println("You entered " + n1 + " and " + n2);

        System.out.println("Next enter two numbers.");
        System.out.println("Decimal points are allowed.");

        double d1, d2;
        d1 = scannerObject.nextDouble( );
        d2 = scannerObject.nextDouble( );
        System.out.println("You entered " + d1 + " and " + d2);

        System.out.println("Next enter two words:");

        String word1 = scannerObject.next( );
        String word2 = scannerObject.next( );
        System.out.println("You entered \"" + 
                                word1 + "\" and \"" + word2 + "\"");

        String junk = scannerObject.nextLine( ); //To get rid of '\n'

        System.out.println("Next enter a line of text:");
        String line = scannerObject.nextLine( );
        System.out.println("You entered: \"" + line + "\"");
    }
}

