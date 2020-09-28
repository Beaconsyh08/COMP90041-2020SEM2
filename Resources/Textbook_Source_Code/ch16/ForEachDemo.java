

import java.util.HashSet;
import java.util.Iterator;

public class ForEachDemo
{
    public static void main(String[] args)
    {
        HashSet<String> s = new HashSet<String>( );

        s.add("health");
        s.add("love");
        s.add("money");

        System.out.println("The set contains:");

        String last = null;
        for (String e : s)
        {
           last = e;
           System.out.println(e);
        }

        s.remove(last);

        System.out.println( );
        System.out.println("The set now contains:");

        for (String e : s)
            System.out.println(e);

        System.out.println("End of program.");
    }
}
