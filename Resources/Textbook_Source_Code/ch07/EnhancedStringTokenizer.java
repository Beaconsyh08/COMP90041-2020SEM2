
import java.util.StringTokenizer;

public class EnhancedStringTokenizer extends StringTokenizer
{
    private String[] a;
    private int count;

    public EnhancedStringTokenizer(String theString )
    {
        super(theString);
        a = new String[countTokens( )];
        count = 0;
    }

    public EnhancedStringTokenizer(String theString, String  delimiters)
    {
        super(theString, delimiters);
        a = new String[countTokens( )];
        count = 0;
    }

    /**
     Returns the same value as the same method in the StringTokenizer class,
     but it also stores data for the method tokensSoFar to use.
    */
    public String nextToken( )
    {
        String token = super.nextToken( );
        a[count] = token;
        count++;
        return token;
    }

    /**
     Returns the same value as the same method in the StringTokenizer class,
     changes the delimiter set in the same way as does the same method in the
     StringTokenizer class, but it also stores data for the method tokensSoFar to use.
    */
    public String nextToken(String delimiters)
    {
        String token = super.nextToken(delimiters);
        a[count] = token;
        count++;
        return token;
    }

    /**
     Returns an array of all tokens produced so far.
     Array returned has length equal to the number of tokens produced so far.
    */
    public String[] tokensSoFar( )
    {
        String[] arrayToReturn = new String[count];
        for (int i = 0; i < count; i++)
            arrayToReturn[i] = a[i];
        return arrayToReturn;
    }

    public Object nextElement( )
	{
	    String token = super.nextToken( );
	    a[count] = token;
	    count++;
	    return (Object)token;
    }
}
