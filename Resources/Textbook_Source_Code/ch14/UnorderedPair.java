
public class UnorderedPair<T> extends Pair<T>
{
    public UnorderedPair()
    {
        setFirst(null);
        setSecond(null);
    }

    public UnorderedPair(T firstItem, T secondItem)
    {
        setFirst(firstItem);
        setSecond(secondItem);
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            UnorderedPair<T> otherPair =
                            (UnorderedPair<T>)otherObject;
            return (getFirst( ).equals(otherPair.getFirst( ))
               && getSecond( ).equals(otherPair.getSecond( )))
               ||
                   (getFirst( ).equals(otherPair.getSecond( ))
               && getSecond( ).equals(otherPair.getFirst( )));
        }
    }
}

