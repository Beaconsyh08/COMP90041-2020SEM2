
import java.util.Scanner;

public class ForEachEnumDemo2
{
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double hours = 0, sum = 0;

        for (WorkDay oneDay : WorkDay.values( ))
        {
            System.out.println("Enter hours worked for " + oneDay);
            hours = keyboard.nextDouble( );
            sum = sum + hours;
        }
        System.out.println("Total hours work = " + sum);
    }
}
