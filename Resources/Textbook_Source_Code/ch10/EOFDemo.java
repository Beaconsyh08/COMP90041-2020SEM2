
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.FileNotFoundException;

public class EOFDemo
{
    public static void main(String[] args)
    {
        try
        {
            ObjectInputStream inputStream =
              new ObjectInputStream(new FileInputStream("numbers.dat"));
            int number;
            System.out.println("Reading numbers in numbers.dat");
            try
            {
                while (true)
                {
                    number = inputStream.readInt( );
                    System.out.println(number);
                }
            }
            catch(EOFException e)
            {
                System.out.println("No more numbers in the file.");
            }
            inputStream.close( );
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find file numbers.dat.");
        }
        catch(IOException e)
        {
            System.out.println("Problem with input from file numbers.dat.");
        }
    }
}
