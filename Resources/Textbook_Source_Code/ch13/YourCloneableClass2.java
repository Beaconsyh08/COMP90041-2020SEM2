

public class YourCloneableClass2 implements Cloneable
{
    private DataClass someVariable;

      //...

    public Object clone( )
    {
        try
        {
            YourCloneableClass2 copy =
                              (YourCloneableClass2)super.clone( );
            copy.someVariable = (DataClass)someVariable.clone( );
            return copy;
        }
        catch(CloneNotSupportedException e)
        {//This should not happen.
            return null; //To keep the compiler happy.
        }
    }

      //...

}
