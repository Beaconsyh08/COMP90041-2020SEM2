
public class Entry
{
    private String item;
    private int count;

    public Entry(String itemData, int countData)
    {
        item = itemData;
        count = countData;
    }

    public String toString( )
    {
        return (item + " " + count);
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            Entry otherEntry = (Entry)otherObject;
            return (item.equals(otherEntry.item) 
                      && (count == otherEntry.count));
        }
    }

   // <There should be other constructors and methods, including accessor and 
   //                       mutator methods, but we do not use them in this demonstration.>
}

