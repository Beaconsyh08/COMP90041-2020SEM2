/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */

import java.util.Arrays;

public class DemoArrayBasic {
    public static void main(String[] args) {
//        // declared and created the array arr1 for size 10 and type int[]
//        int[] arr1 = new int[10];
//
//        // using Square Brackets to access the indexed variable
//        arr1[0] = 9;
//        arr1[5] = 3;
//
//        // Get the length
//        System.out.println("arr1.length = " + arr1.length);
////        System.out.println(arr1);
////        System.out.println("arr1: " + Arrays.toString(arr1));

        // initialize the array arr2 with 3 value
        int[] arr2 = {5, 7, 6};

        // Get the length
        System.out.println("arr2.length = " + arr2.length);
        System.out.println("arr2: " + Arrays.toString(arr2));

//         ArrayIndexOutOfBoundsException
//        System.out.println("arr2[3] = " + arr2[3]);

        // Using for-each loop to display the array

        for (int x : arr2) {
            System.out.print(x + " ");
            //statement
        }
        System.out.println();

        // Using for-each loop
//        for (int value: arr1) {
//            System.out.print(value + " ");
//        }
//        System.out.println();
    }
}
