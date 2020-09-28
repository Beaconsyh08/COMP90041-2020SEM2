
public class SampleException extends Exception
{
    public SampleException( )
    {
        super("Sample Exception thrown!");
    }

    public SampleException(String message)
    {
        super(message);
    }
}
