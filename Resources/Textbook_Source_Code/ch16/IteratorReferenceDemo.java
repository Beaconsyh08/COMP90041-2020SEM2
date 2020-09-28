

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorReferenceDemo
{
    public static void main(String[] args)
    {
        ArrayList<Date> birthdays = new ArrayList<Date>( );


        birthdays.add(new Date(1, 1, 1990));
        birthdays.add(new Date(2, 2, 1990));
        birthdays.add(new Date(3, 3, 1990));


        System.out.println("The list contains:");


        Iterator<Date> i = birthdays.iterator( );
        while (i.hasNext( ))
            System.out.println(i.next( ));

        i = birthdays.iterator( );
        Date d = null; //To keep the compiler happy.
        System.out.println("Changing the references.");
        while (i.hasNext( ))
        {
            d = i.next( );
            d.setDate(4, 1, 1990);
        }


        System.out.println("The list now contains:");


        i = birthdays.iterator( );
        while (i.hasNext( ))
            System.out.println(i.next( ));


        System.out.println("April fool!");
    }
}

