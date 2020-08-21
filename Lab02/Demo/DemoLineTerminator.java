import java.util.Scanner;

/**
 * Description
 * This is for Demonstration Purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoLineTerminator {
    /*
   Deal with the junk "\n"
   The method nextInt reads the <2> but does not read the end-of-line character '\n'.
   So the first nextLine invocation reads the rest of the line that after the <2>
   There is nothing more on that line (except for '\n'), so nextLine returns the empty string.
   The second invocation of nextLine begins on the next line and reads "heads are better than".
*/

    // 2 \n
    // heads are better than \n
    // 1 head. \n
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your sentence:");
        int n = keyboard.nextInt();

        // junk line
        String junk = keyboard.nextLine();

        String s1 = keyboard.nextLine();
        String s2 = keyboard.nextLine();

        System.out.println("n = " + n);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("junk = " + junk);
    }
}


