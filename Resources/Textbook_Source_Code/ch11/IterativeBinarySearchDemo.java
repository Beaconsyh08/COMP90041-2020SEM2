
public class IterativeBinarySearchDemo
{
    public static void main(String[] args)
    {
        int[] a = {-2, 0, 2, 4, 6, 8, 10, 12, 14, 16};
        int finalIndex = 9;

        System.out.println("Array contains:");
        for (int i = 0; i < a.length; i++)
             System.out.print(a[i] + " ");
        System.out.println( );
        System.out.println( );

        int result;
        for (int key = -3; key < 5; key++)
        {
            result = IterativeBinarySearch.search(a, 0, finalIndex, key);
            if (result >= 0)
                System.out.println(key + " is at index " + result);
             else
                 System.out.println(key + " is not in the array.");
        }
    }
}
