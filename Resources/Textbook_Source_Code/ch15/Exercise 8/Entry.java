
public class Entry
{
     private String item;
     private int count;

    public Entry( )
    {
        item = null;
        count = 0;
    }

    public Entry(String itemData, int countData) 
    {
        item = itemData;
        count = countData;
    }

    public void setItem(String itemData )
    {
        item = itemData;
    }

    public void setCount(int countData) 
    {
        count = countData;
    }

    public String getItem( )
    {
        return item;
    }

    public int getCount(  )
    {
        return count;
    }
}
