/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoPBVPrimitive {
    public static void main(String[] args) {

        // For primitive type
        int x = 20;
        System.out.println("x before = " + x);
        DemoPBVPrimitive.changex(x);
        System.out.println("x after = " + x);
    }

    public static void changex(int x) {
        x = 30;
        System.out.println("x inside changx = " + x);
    }
}
