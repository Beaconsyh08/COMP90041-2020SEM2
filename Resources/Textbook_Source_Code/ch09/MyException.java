
public class MyException extends Exception
{
    public MyException( )
    {
        super("My Exception thrown!");
    }

    public MyException(String message)
    {
        super("MyException: " + message);
    }
}
