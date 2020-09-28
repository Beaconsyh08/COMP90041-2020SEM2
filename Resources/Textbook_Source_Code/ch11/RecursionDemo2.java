
public class RecursionDemo2
{
    public static void main(String[] args)
    {
        for (int n = 0; n < 4; n++)
            System.out.println("3 to the power " + n
                + " is " + power(3, n));
    }

    public static int power(int x, int n)
    {
        if (n < 0)
        {
            System.out.println("Illegal argument to power.");
            System.exit(0);
        }

        if (n > 0)
            return ( power(x, n - 1)*x );
        else // n == 0
             return (1);
    }
}
