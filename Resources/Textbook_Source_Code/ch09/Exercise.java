
public class Exercise
{
    public static void main(String[] args)
    {
       try
       {
           System.out.println("Trying");
           sampleMethod(98.6);
           System.out.println("Trying after call.");
       }
       catch(Exception e)
       {
           System.out.println("Catching.");
       }

       System.out.println("End program.");
    }

    public static void sampleMethod(double test) 
                                          throws Exception
    {
           System.out.println("Starting sampleMethod.");
           if (test < 100)
                   throw new Exception( );
    }
}
