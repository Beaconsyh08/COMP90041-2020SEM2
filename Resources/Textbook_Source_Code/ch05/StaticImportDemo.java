
import java.util.Scanner;
import static java.lang.Character.toUpperCase;
//Alternatively, you can replace the above line with the following:
//import static java.lang.Character.*;

/**
Illustrate the use of a static method from the class Character.
*/

public class StaticImportDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter a one line sentence:");
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine( );

        sentence = sentence.toLowerCase( );
        char firstCharacter = sentence.charAt(0);
        sentence = toUpperCase(firstCharacter)
                           + sentence.substring(1);

        System.out.println("The revised sentence is:");
        System.out.println(sentence);
    }
}


