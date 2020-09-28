
import java.util.Scanner;
import static java.lang.Math.PI;
//Alternatively, you can replace the above line with the following:
//import static java.lang.Math.*;

/**
Class with static methods for circles and spheres.
*/
public class StaticImportDemo2
{

    /**
     Return the area of a circle of the given radius.
    */
    public static double area(double radius)
    {
        return (PI*radius*radius);
    }

    /**
     Return the volume of a sphere of the given radius.
    */
    public static double volume(double radius)
    {
        return ((4.0/3.0)*PI*radius*radius*radius);
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


