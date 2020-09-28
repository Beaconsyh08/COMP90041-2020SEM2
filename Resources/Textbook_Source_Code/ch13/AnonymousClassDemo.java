

public class AnonymousClassDemo
{
    public static void main(String[] args)
    {
        NumberCarrier anObject = 
                  new NumberCarrier( )
                  {
                      private int number;
                      public void setNumber(int value)
                      {
                          number = value;
                      }
                      public int getNumber( )
                      {
                         return number;
                      }
                   };

        NumberCarrier anotherObject = 
                  new NumberCarrier( )
                  {
                      private int number;
                      public void setNumber(int value)
                      {
                          number = 2*value;
                      }
                      public int getNumber( )
                      {
                          return number;
                      }
                  };

        anObject.setNumber(42);
        anotherObject.setNumber(42);
        showNumber(anObject);
        showNumber(anotherObject);
        System.out.println("End of program.");
    }

    public static void showNumber(NumberCarrier o)
    {
        System.out.println(o.getNumber( ));
    }

}
