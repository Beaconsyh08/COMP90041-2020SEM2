public class YourCloneableClass implements Cloneable
{
     //...
     
    public Object clone( )
    {
       try
       {
          return super.clone( );//Invocation of clone 
                               //in the base class Object
       }
       catch(CloneNotSupportedException e)
       {//This should not happen.
          return null; //To keep the compiler happy.
       }
    }

     //...
     
}
