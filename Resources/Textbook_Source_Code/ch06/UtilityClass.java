
public class UtilityClass
{
    /**
     Returns the largest of any number of int values.
    */
   public static int max(int... arg)
    {
        if (arg.length == 0)
        {
           System.out.println("Fatal Error: maximum of zero values.");
           System.exit(0);
        }

        int largest = arg[0];
        for (int i = 1; i < arg.length; i++)
            if (arg[i] > largest)
                largest = arg[i];
        return largest;
    }
}

