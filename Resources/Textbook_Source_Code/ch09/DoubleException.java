
public class DoubleException extends Exception
{
    private double doubleMessage;

    public DoubleException( )
    {
        super("DoubleException thrown!");
    }

    public DoubleException(String message)
    {
        super(message);
    }

    public DoubleException(double number)
    {
        super("DoubleException thrown!");
        doubleMessage = number;
    }

    public double getNumber( )
    {
        return doubleMessage;
    }
}
