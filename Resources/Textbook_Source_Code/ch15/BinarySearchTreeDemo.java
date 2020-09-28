
import java.util.Scanner;

public class BinarySearchTreeDemo
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      IntTree tree = new IntTree( );

      System.out.println("Enter a list of nonnegative integers.");
      System.out.println("Place a negative integer at the end.");
      int next = keyboard.nextInt( );
      while (next >= 0)
      {
          tree.add(next);
          next = keyboard.nextInt( );
      }

      System.out.println("In sorted order:");
      tree.showElements( );
   }
}
