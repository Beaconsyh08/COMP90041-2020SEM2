/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoBreak {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                System.out.println("break");
                break;
            }
            System.out.println("x = " + x);
        }

        System.out.println("--------------------------------------");

        int i = 0;
        while (i < numbers.length) {
            if (numbers[i] == 30) {
                System.out.println("break");
                break;
            }
            System.out.println("number = " + numbers[i]);
            i++;
        }

    }
}