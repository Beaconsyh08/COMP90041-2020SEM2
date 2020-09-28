

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class ArrayIODemo
{

    public static void main(String[] args)
    {
        SomeClass[] a = new SomeClass[2];
        a[0] = new SomeClass(1, 'A');
        a[1] = new SomeClass(2, 'B');

        try
        {
            ObjectOutputStream outputStream =
                 new ObjectOutputStream(new FileOutputStream("arrayfile"));

            outputStream.writeObject(a);
            outputStream.close( );
        }
        catch(IOException e)
        {
            System.out.println("Error writing to file.");
            System.exit(0);
        }

         System.out.println(
                   "Array written to file arrayfile.");

        System.out.println(
              "Now let's reopen the file and display the array.");

        SomeClass[] b = null;

        try
        {
            ObjectInputStream inputStream = 
                 new ObjectInputStream(new FileInputStream("arrayfile"));
            b = (SomeClass[])inputStream.readObject( );
            inputStream.close( );
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Cannot find file arrayfile.");
            System.exit(0);
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Problems with file input.");
            System.exit(0);
        }
        catch(IOException e)
        {
            System.out.println("Problems with file input.");
            System.exit(0);
        }

        System.out.println(
              "The following array elements were read from the file:");
        int i;
        for (i = 0; i < b.length; i++)
            System.out.println(b[i]);

        System.out.println("End of program.");
    }
}
