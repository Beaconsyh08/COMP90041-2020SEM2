
public class TestException extends Exception
{
    public TestException( )
    {
        super("Test Exception thrown!");
        System.out.println(
                   "Test exception thrown!!");
    }

    public TestException(String message)
    {
        super(message);
        System.out.println(
         "Test exception thrown with an argument!");
    }

    public void testMethod( )
    {
        System.out.println("Message is " + getMessage( ));
    }
}
