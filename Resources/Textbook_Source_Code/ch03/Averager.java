
import java.util.Scanner;

public class Averager
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a list of nonnegative scores.");
        System.out.println("Mark the end with a negative number.");
        System.out.println("I will compute their average.");

        double next, sum = 0; 
        int count = 0;

        next = keyboard.nextDouble( );
        while(next >= 0)
        {
            sum = sum + next;
            count++;
            next = keyboard.nextDouble( );
        }

        if (count == 0)
            System.out.println("No scores entered.");
        else
        {
            double average = sum/count;
            System.out.println(count + " scores read.");
            System.out.println("The average is " + average);
        }
    }
}

 
