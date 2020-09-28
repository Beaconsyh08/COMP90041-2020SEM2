/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoStringComparison {
    public static void main(String[] args) {
        String s1 = new String("Hello Java");
        String s2 = new String("Hello Java");
        String s3 = "Hello Python";
        String s4 = "Hello Python";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);

    }
}


