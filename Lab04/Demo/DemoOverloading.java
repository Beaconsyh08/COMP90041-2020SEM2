/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoOverloading {
    public static void main(String[] args) {
        DemoOverloading overloading = new DemoOverloading();
//        overloading.max(3, 4);
//        overloading.max(3.5, 4.5);
//        overloading.max(3, 4.5);
    }

    //    // Ambiguous Invocation
    public double max(int num1, double num2) {
        System.out.println("Method3 invoked");
        System.out.println(Math.max(num1, num2));
        return Math.max(num1, num2);
    }

    public double max(double num1, int num2) {
        System.out.println("Method4 invoked");
        System.out.println(Math.max(num1, num2));
        return Math.max(num1, num2);
    }





    // Overloading
    // Automatic Type Conversion
//    public int max(int num1, int num2) {
//        System.out.println("Method1 invoked");
//        System.out.println(Math.max(num1, num2));
//        return Math.max(num1, num2);
//    }
//
//    public double max(double num1, double num2) {
//        System.out.println("Method2 invoked");
//        System.out.println(Math.max(num1, num2));
//        return Math.max(num1, num2);
//    }





}
