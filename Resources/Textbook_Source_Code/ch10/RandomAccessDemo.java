

import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.FileNotFoundException;

public class RandomAccessDemo
{
  public static void main(String[] args)
  {
     try
     {
         RandomAccessFile ioStream =
           new RandomAccessFile("bytedata", "rw");

         System.out.println("Writing 3 bytes to the file bytedata.");
         ioStream.writeByte(1);
         ioStream.writeByte(2);
         ioStream.writeByte(3);
         System.out.println("The length of the file is now = "
                             + ioStream.length( ));
         System.out.println("The file pointer location is " 
                             + ioStream.getFilePointer( ));

         System.out.println("Moving the file pointer to location 1.");
         ioStream.seek(1);
         byte oneByte = ioStream.readByte( );
         System.out.println("The value at location 1 is " + oneByte);
         oneByte = ioStream.readByte( );
         System.out.println("The value at the next location is " 
                            + oneByte);

         System.out.println("Now we move the file pointer back to");
         System.out.println("location 1, and change the byte.");
         ioStream.seek(1);
         ioStream.writeByte(9);
         ioStream.seek(1);
         oneByte = ioStream.readByte( );
         System.out.println("The value at location 1 is now " + oneByte);

         System.out.println("Now we go to the end of the file");
         System.out.println("and write a double.");
         ioStream.seek(ioStream.length( ));
         ioStream.writeDouble(41.99);
         System.out.println("The length of the file is now = "
                            + ioStream.length( ));

         System.out.println("Returning to location 3,");
         System.out.println("where we wrote the double.");
         ioStream.seek(3);
         double oneDouble = ioStream.readDouble( );
         System.out.println("The double value at location 3 is " 
                                + oneDouble);

         ioStream.close( );
     }
     catch(FileNotFoundException e)
     {
         System.out.println("Problem opening file.");
     }
     catch(IOException e)
     {
         System.out.println("Problems with file I/O.");
     }
     System.out.println("End of program.");
  }
}
