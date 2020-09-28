
import java.util.Scanner;

/**
Class for a temperature (expressed in degrees Celsius). 
*/
public class Temperature
{
    private double degrees; //Celsius

    public Temperature( )
    {
        degrees = 0;
    }

    public Temperature(double initialDegrees)
    {
        degrees = initialDegrees;
    }

    public void setDegrees(double newDegrees)
    {
        degrees = newDegrees;
    }

    public double getDegrees( )
    {
        return degrees;
    }    

    public String toString( )
    {
        return (degrees + " C"); 
    }

    public boolean equals(Temperature otherTemperature)
    {
        return (degrees == otherTemperature.degrees);
    }


    /**
     Returns number of Celsius degrees equal to 
     degreesF Fahrenheit degrees.
    */
    public static double toCelsius(double degreesF)
    {
       
         return 5*(degreesF - 32)/9;
    }

    public static void main(String[] args)
    {
        double degreesF, degreesC;
                      
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter degrees Fahrenheit:");
        degreesF = keyboard.nextDouble( );

        degreesC = toCelsius(degreesF);

        Temperature temperatureObject = new Temperature(degreesC);
        System.out.println("Equivalent Celsius temperature is "
                             + temperatureObject.toString( ));
    }
}

























