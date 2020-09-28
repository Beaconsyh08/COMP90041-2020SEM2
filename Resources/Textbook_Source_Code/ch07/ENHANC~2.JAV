
import java.util.Scanner;

public class EnhancedStringTokenizerDemo
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String sentence = keyboard.nextLine( );

        EnhancedStringTokenizer wordFactory = 
             new EnhancedStringTokenizer(sentence);

        System.out.println("Your sentence with extra blanks deleted:");
        while (wordFactory.hasMoreTokens( ))
            System.out.print(wordFactory.nextToken( ) + " "); 
        System.out.println( );
        //All tokens have been dispensed.

        System.out.println("Sentence with each word on a separate line:");
        String[] token = wordFactory.tokensSoFar( );
        for (int i = 0; i < token.length; i++)
            System.out.println(token[i]);
     }
}
