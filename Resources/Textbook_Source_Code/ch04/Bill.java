
import java.util.Scanner;

public class Bill
{
    public static double RATE = 150.00; //Dollars per quarter hour

    private int hours; 
    private int minutes;
    private double fee; 

    public void inputTimeWorked( )
    {
        System.out.println("Enter number of full hours worked");
        System.out.println("followed by number of minutes:");
        Scanner keyboard = new Scanner(System.in);
        hours = keyboard.nextInt( );
        minutes = keyboard.nextInt( );
    }

    public double computeFee(int hoursWorked, int minutesWorked)
    {
        minutesWorked = hoursWorked*60 + minutesWorked;
        int quarterHours = minutesWorked/15; //Any remaining fraction of a
                                         // quarter hour is not charged for.
        return quarterHours*RATE;
    }

    public void updateFee( )
    {
        fee = computeFee(hours, minutes);
    }

    public void outputBill( )
    {
        System.out.println("Time worked: ");
        System.out.println(hours + " hours and " + minutes + " minutes");
        System.out.println("Rate: $" + RATE + " per quarter hour.");
        System.out.println("Amount due: $" + fee);
    }
}
