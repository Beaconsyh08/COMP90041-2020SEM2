/**
 * Description
 * This is for Demonstration Purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoPrntf {
    public static void main(String[] args) {
        String display = "Average";
        double average = 7.89576;
        System.out.printf("%s:%-10.3f%n", display, average);
        System.out.printf("%s:%10.3f%n", display, average);

        System.out.printf("%s:%-10.2f%n", display, average);
        System.out.printf("%s:%10.2f%n", display, average);

    }
}
