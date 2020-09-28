
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HasNextIntDemo
{
    public static void main(String[] args)
    {
        Scanner inputStream = null;

        try
        {
           inputStream =
              new Scanner(new FileInputStream("data.txt"));
        }
        catch(FileNotFoundException e)
        {
           System.out.println("File data.txt was not found");
           System.out.println("or could not be opened.");
           System.exit(0);
        }

        int next, sum = 0;
        while (inputStream.hasNextInt( ))
        {
            next = inputStream.nextInt( );
            sum = sum + next;
        }

        inputStream.close( );

        System.out.println("The sum of the numbers is " + sum);
    }
}

