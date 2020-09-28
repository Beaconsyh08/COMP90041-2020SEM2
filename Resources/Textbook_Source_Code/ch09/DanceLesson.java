
import java.util.Scanner;

public class DanceLesson
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of male dancers:");
        int men = keyboard.nextInt();

        System.out.println("Enter number of female dancers:");
        int women = keyboard.nextInt();

        if (men == 0 && women == 0)
        {
            System.out.println("Lesson is canceled. No students.");
            System.exit(0);
        }
        else if (men == 0)
        {
            System.out.println("Lesson is canceled. No men.");
            System.exit(0);
        }
        else if (women == 0)
        {
            System.out.println("Lesson is canceled. No women.");
            System.exit(0);
        }
 
       // women >= 0 && men >= 0
       if (women >= men)
            System.out.println("Each man must dance with " +
                                     women/(double)men + " women.");
        else
            System.out.println("Each woman must dance with " +
                                      men/(double)women + " men.");
        System.out.println("Begin the lesson.");
    }
}
