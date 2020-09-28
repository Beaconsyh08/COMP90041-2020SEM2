
/**
 Class Invariant: All objects have a name string and hire date.
 A name string of "No name" indicates no real name specified yet.
 A hire date of January 1, 1000 indicates no real hire date specified yet.
*/
public abstract class Employee
{
    private String name;
    private Date hireDate;

    public abstract double getPay( );

    public boolean samePay(Employee other)
    {
        if (other == null)
        {
            System.out.println("Error: null Employee object.");
            System.exit(0);
        }
        //else
        return (this.getPay( ) == other.getPay( ));
    }

    public Employee( )
    {
         name = "No name";
         hireDate = new Date("Jan", 1, 1000); //Just a placeholder.
    }

    /**
     Precondition: Neither theName nor theDate is null.
    */
    public Employee(String theName, Date theDate)
    {
        if (theName == null || theDate == null)
        {
             System.out.println("Fatal Error creating employee.");
             System.exit(0);
        }
        name = theName;
        hireDate = new Date(theDate);
    }

    public Employee(Employee originalObject)
    {
         name = originalObject.name;
         hireDate = new Date(originalObject.hireDate);
    }

    public String getName( )
    {
        return name;
    }

    public Date getHireDate( )
    {
        return new Date(hireDate);
    }

    /**
     Precondition newName is not null.
    */
    public void setName(String newName)
    {
        if (newName == null)
        {
             System.out.println("Fatal Error setting employee name.");
             System.exit(0);
        }
       else
            name = newName;
    }

    /**
     Precondition newDate is not null.
    */
    public void setHireDate(Date newDate)
    {
        if (newDate == null)
        {
             System.out.println("Fatal Error setting employee hire date.");
             System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }


    public String toString( )
    {
        return (name + " " + hireDate.toString( ));
    }


    public boolean equals(Object otherObject)
	{
	    if (otherObject == null)
	        return false;
	    else if (getClass( ) != otherObject.getClass( ))
	        return false;
	    else
	    {
	        Employee otherEmployee =
	                       (Employee)otherObject;
	        return (name.equals(otherEmployee.name)
	         && hireDate.equals(otherEmployee.hireDate));
	    }
    }
}

