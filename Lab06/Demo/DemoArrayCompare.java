/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */

import java.util.Arrays;

public class DemoArrayCompare {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = arr1;

//        System.out.println(arr1);
//        System.out.println(arr2);
        System.out.println("arr1 == arr2 " + (arr1 == arr2));
        System.out.println("equals arr1 arr2 " + Arrays.equals(arr1, arr2));

        System.out.println("arr1 == arr3 " + (arr1 == arr3));
        System.out.println("equals arr1 arr3 " + Arrays.equals(arr1, arr3));

    }
}
