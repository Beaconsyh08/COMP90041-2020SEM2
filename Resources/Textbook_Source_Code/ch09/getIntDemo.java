
import java.util.Scanner;
import java.util.InputMismatchException;

public class getIntDemo
{
    /**
    Precondition: keyboard is an object of the class Scanner that has
    been set up for keyboard input (as we have been doing right along).
    Returns: An int value entered at the keyboard.
    If the user enters an incorrectly formed input she or he is
    prompted to reenter the value,
    */
    public static int getInt(Scanner keyboard)
    {
        int number = 0; //to keep compiler happy
        boolean done = false;

        while (! done)
        {
            try
            {
                System.out.println("Enter a whole number:");
                number = keyboard.nextInt();
                done = true;
             }
             catch(InputMismatchException e)
             {
                 keyboard.nextLine();
                 System.out.println(
                       "Not a correctly written whole number.");
                 System.out.println("Try again.");
             }
        }

        return number;
    }

    public static void main(String[] args)
    {
        Scanner keyboardArg = new Scanner(System.in);
        int number = getInt(keyboardArg);
        System.out.println("You entered " + number);
    }
}
