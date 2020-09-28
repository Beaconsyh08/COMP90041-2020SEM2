
import java.util.Scanner;

/**
Class with static methods for circles and spheres.
*/
public class RoundStuff3
{

    /**
     Return the area of a circle of the given radius.
    */
    public static double area(double radius)
    {
        return (Math.PI*radius*radius);
    }
    
    /**
     Return the volume of a sphere of the given radius.
    */
    public static double volume(double radius)
    {
        return ((4.0/3.0)*Math.PI*radius*radius*radius);
    }

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter radius:");
        double radius = keyboard.nextDouble( );
                                            
        System.out.println("A circle of radius " 
                                      + radius + " inches");
        System.out.println("has an area of " +
             RoundStuff.area(radius) + " square inches.");
        System.out.println("A sphere of radius " 
                                      + radius + " inches");
        System.out.println("has an volume of " +
             RoundStuff.volume(radius) + " cubic inches.");
    }
}


