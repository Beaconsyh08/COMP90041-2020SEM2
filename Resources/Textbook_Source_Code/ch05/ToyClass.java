
public class ToyClass
{
    private String name;
    private int number;

    public ToyClass(String initialName, int initialNumber)
    {
        name = initialName;
        number = initialNumber;
    }

    public ToyClass( )
    {
        name = "No name yet.";
        number = 0;
    }

    public void set(String newName, int newNumber)
    {
        name = newName;
        number = newNumber;
    }

    public String toString( )
    {
        return (name + " " + number);
    }

    public static void changer(ToyClass aParameter)
    {
        aParameter.name = "Hot Shot";
        aParameter.number = 42;
    }

    public boolean equals(ToyClass otherObject)
    {
        return ( (name.equals(otherObject.name))
                  && (number == otherObject.number) );
    }
}
