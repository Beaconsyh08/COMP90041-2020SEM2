

import java.util.Scanner;

public class RoundStuffDemo
{
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
