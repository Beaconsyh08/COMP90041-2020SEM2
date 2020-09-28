

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIteratorDemo
{
    public static void main(String[] args)
    {
        HashSet<String> s = new HashSet<String>( );

        s.add("health");
        s.add("love");
        s.add("money");

        System.out.println("The set contains:");

        Iterator<String> i = s.iterator( );
        while (i.hasNext( ))
            System.out.println(i.next( ));

        i.remove( );

        System.out.println( );
        System.out.println("The set now contains:");

        i = s.iterator( );
        while (i.hasNext( ))
            System.out.println(i.next( ));

        System.out.println("End of program.");
    }
}
 

