

/**
 Demonstrates the correct way to define an accessor
 method to a private array of class objects.
*/
public class ToyExample
{
    private Date[] a;

    public ToyExample(int arraySize)
    {
        a = new Date[arraySize];
        for (int i = 0; i < arraySize; i++)
             a[i] = new Date( );
    }

    public ToyExample(ToyExample object)
    {
        int lengthOfArrays = object.a.length;
        this.a = new Date[lengthOfArrays];
        for (int i = 0; i < lengthOfArrays; i++)
             this.a[i] = new Date(object.a[i]);
    }

    public Date[] getDateArray( )
    {
        Date[] temp = new Date[a.length];
        for (int i = 0; i < a.length; i++)
            temp[i] = new Date(a[i]);
        return temp;
    }

       //   <There presumably are other methods that are not shown,
                           //but they are irrelevant to the point at hand.>

}

