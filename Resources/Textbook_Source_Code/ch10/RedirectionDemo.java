
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class RedirectionDemo
{
   public static void main(String[] args)
   {
      PrintStream errStream = null;
      try
      {
          errStream = 
               new PrintStream(
                       new FileOutputStream("errormessages.txt"));
      }
      catch(FileNotFoundException e)
      {
         System.out.println(
                  "Error opening file with FileOutputStream.");
         System.exit(0);
      }

      System.setErr(errStream);

      System.err.println("Hello from System.err.");
      System.out.println("Hello from System.out.");
      System.err.println("Hello again from System.err.");

      errStream.close( );
   }
}


