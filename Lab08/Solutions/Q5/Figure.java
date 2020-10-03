package Solutions.Q5;

/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

public class Figure 
{
   public Figure ()
   {
      System.out.println("Creating a figure with no parameters.");
   }

   public void erase()
   {
      System.out.println("Call to Figure's erase method.");
   }

   public void draw()
   {
      System.out.println("Call to Figure's draw method.");
   }

   public void center()
   {
      System.out.println("Calling Figure's center method.");
      this.erase();
      this.draw();
   }

}// Figure
