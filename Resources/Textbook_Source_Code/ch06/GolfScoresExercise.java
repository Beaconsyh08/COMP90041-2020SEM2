
import java.util.Scanner;

public class GolfScoresExercise
{
    public static final int MAX_NUMBER_SCORES = 10;

    /**
     Shows differences between each of a list of golf scores and their average.
    */
    public static void main(String[] args)
    {
        double[] score = new double[MAX_NUMBER_SCORES];
        int numberUsed = 0;

        System.out.println("This program reads golf scores and shows");
        System.out.println("how much each differs from the average.");


        System.out.println("Enter golf scores:");
        numberUsed = fillArray(score);
        showDifference(score, numberUsed);
    }

    /**
	 Precondition: numberUsed <= argumentArray.length;
	 the first numberUsed indexed variables of argumentArray
	 have values.
	 Returns an array of length numberUsed whose ith element
	 is argumentArray[i] - adjustment.
	*/
	public static double[] differenceArray(
	 double[] argumentArray, int numberUsed, double adjustment)
	{
	    double[] temp = new double[numberUsed];
	    for (int i = 0; i < numberUsed; i++)
	        temp[i] = argumentArray[i] - adjustment;
	    return temp;
    }

    /**
     Reads values into the array a. Returns the number of values placed in the array a.
    */
    public static int fillArray(double[] a)
    {
        System.out.println("Enter up to " + a.length
                               + " nonnegative numbers.");
        System.out.println("Mark the end of the list with a negative number.");
        Scanner keyboard = new Scanner(System.in);

        double next;
        int index = 0;
        next = keyboard.nextDouble( );
        while ((next >= 0) && (index < a.length))
        {
            a[index] = next;
            index++;
            next = keyboard.nextDouble( );
           //index is the number of array indexed variables used so far.
        }
       //index is the total number of array indexed variables used.

        if (next >= 0)
             System.out.println("Could only read in "
                                + a.length + " input values.");

        return index;
    }

    /**
     Precondition: numberUsed <= a.length.
                   a[0] through a[numberUsed-1] have values.
     Returns the average of numbers a[0] through a[numberUsed-1].
    */


    public static double computeAverage(double[] a, int numberUsed)
    {
        double total = 0;
        for (int index = 0; index < numberUsed; index++)
            total = total + a[index];
        if (numberUsed > 0)
        {
            return (total/numberUsed);
        }
        else
        {
            System.out.println("ERROR: Trying to average 0 numbers.");
            System.out.println("computeAverage returns 0.");
            return 0;
        }
    }


    private static double stringToDouble(String stringObject)
    {
        return Double.parseDouble(stringObject.trim( ));
    }

    /**
     Precondition: numberUsed <= a.length.
                   The first numberUsed indexed variables of a have values.
      Postcondition: Gives screen output showing how much each of the first
      numberUsed elements of the array a differ from their average.
    */
    public static void showDifference(double[] a,
	                                          int numberUsed)
	{
	    double average = computeAverage(a, numberUsed);
	    System.out.println("Average of the " + numberUsed
	                                 + " scores = " + average);
	    double[] difference =
	                   differenceArray(a, numberUsed, average);
	    System.out.println("The scores are:");
	    for (int index = 0; index < numberUsed; index++)
	          System.out.println(a[index] +
	                            " differs from average by "
	                                    + difference[index]);
    }

}

