
import java.util.Scanner;

public class ForEachEnumDemo
{
    enum WorkDay {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY};

    public static void main(String[] args)
    {
        WorkDay[] day = WorkDay.values( );

        Scanner keyboard = new Scanner(System.in);
        double hours = 0, sum = 0;

        for (WorkDay oneDay : day)
        {
             System.out.println("Enter hours worked for " + oneDay);
             hours = keyboard.nextDouble( );
             sum = sum + hours;
        }

        System.out.println("Total hours work = " + sum);
    }
}
