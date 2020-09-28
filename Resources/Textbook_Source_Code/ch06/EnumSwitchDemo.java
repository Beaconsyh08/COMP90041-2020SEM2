
import java.util.Scanner;

public class EnumSwitchDemo
{
    enum Flavor {VANILLA, CHOCOLATE, STRAWBERRY};

    public static void main(String[] args)
    {
        Flavor favorite = null;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your favorite flavor?");
        String answer = keyboard.next();
        answer = answer.toUpperCase();
        favorite = Flavor.valueOf(answer);

        switch (favorite)
        {
            case VANILLA:
                System.out.println("Classic");
                break;
            case CHOCOLATE:
                System.out.println("Rich");
                break;
            default:
                System.out.println("I bet you said STRAWBERRY.");
                break;
        }
    }
}
 