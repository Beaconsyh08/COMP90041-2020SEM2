
public class ToyClass2
{
    private String name;
    private int number;

    public void set(String newName, int newNumber)
    {
        name = newName;
        number = newNumber;
    }

    public String toString( )
    {
        return (name + " " + number);
    }

    public void makeEqual(ToyClass2 anObject)
    {
        anObject.name = this.name;
        anObject.number = this.number;
    }

    public void tryToMakeEqual(int aNumber)
    {
        aNumber = this.number;
    }

    public boolean equals(ToyClass2 otherObject)
    {
        return ( (name.equals(otherObject.name))
                  && (number == otherObject.number) );
    }

 //<Other methods can be the same as in Display 5.11, although no
      //        other methods are needed or used in the current discussion.>
}
