

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokenizerDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your last name");
        System.out.println("followed by your first and middle names.");
        System.out.println("If you have no middle name,");
        System.out.println("enter \"None\".");
        String inputLine = keyboard.nextLine( );

        String delimiters = ", "; //Comma and blank space
        StringTokenizer nameFactory = 
             new StringTokenizer(inputLine, delimiters);

        String lastName = nameFactory.nextToken( );
        String firstName = nameFactory.nextToken( );
        String middleName = nameFactory.nextToken( );
        if (middleName.equalsIgnoreCase("None"))
            middleName = ""; //Empty string
        System.out.println("Hello " + firstName
                               + " " + middleName + " " + lastName);
     }
}
