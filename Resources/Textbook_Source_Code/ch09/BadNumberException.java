
public class BadNumberException extends Exception
{
    private int badNumber;

    public BadNumberException(int number)
    {
        super("BadNumberException"); 
        badNumber = number; 
    }

    public BadNumberException( )
    {
        super("BadNumberException"); 
    }

    public BadNumberException(String message)
    {
        super(message); 
    }

    public int getBadNumber( )
    {
        return badNumber;
    }
}
