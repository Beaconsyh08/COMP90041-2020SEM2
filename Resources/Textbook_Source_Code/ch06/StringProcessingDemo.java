
import java.util.Scanner;

public class StringProcessingDemo
{

    public static void main(String[] args)
    {
        System.out.println("What did you eat for dinner?");
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine( );
        sentence = Utility2.censor(sentence, 
                                "candy", "french fries", "salt", "beer");
        sentence = Utility2.censor(sentence, " ,"); //Deletes extra commas
        System.out.println("You would be healthier if you could answer:"); 
        System.out.println(sentence); 
     }
}
