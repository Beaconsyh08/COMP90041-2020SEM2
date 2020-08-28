/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoContinue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                System.out.println("continue");
                continue;
            }
            System.out.println("x = " + x);
        }

        System.out.println("-----------------------------------------");

//        int i = 0;
//        while (i < numbers.length) {
//            System.out.println("i = " + i);
//            if (numbers[i] == 30) {
//                System.out.println("continue");
//                // TODO If you need to use continue in the while loop, you need to xxxxxxxx here
//                continue;
//            }
//            System.out.println("number = " + numbers[i]);
//            i++;
//        }

    }
}