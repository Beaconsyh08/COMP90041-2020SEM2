
import java.util.ArrayList;

public class StringSelectionSortDemo
{
    public static void main(String[] args)
    {
        ArrayList<String> b = new ArrayList<String>( );
        b.add("time");
        b.add("tide");
        b.add("clouds");
        b.add("rain"); 

        System.out.println("ArrayList values before sorting:");
        int i;
        for (String e : b)
            System.out.print(e + " ");
        System.out.println( );
        StringSelectionSort.sort(b);
        System.out.println("ArrayList values after sorting:");
        for (String e : b)
            System.out.print(e + " ");
        System.out.println( );
    }
}
