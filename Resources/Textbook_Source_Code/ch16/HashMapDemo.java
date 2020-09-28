// This class uses the Employee class defined in Chapter 7.
import java.util.HashMap;
import java.util.Scanner;
public class HashMapDemo
{
	public static void main(String[] args)
	{
		// First create a hashmap with an initial size of 10 and
		// the default load factor
		HashMap<String,Employee> employees =
			new HashMap<String,Employee>(10);

		// Add several employees objects to the map using
		// their name as the key
		employees.put("Joe",
			new Employee("Joe",new Date("September", 15, 1970)));
		employees.put("Andy",
			new Employee("Andy",new Date("August", 22, 1971)));
		employees.put("Greg",
			new Employee("Greg",new Date("March", 9, 1972)));
		employees.put("Kiki",
			new Employee("Kiki",new Date("October", 8, 1970)));
		employees.put("Antoinette",
			new Employee("Antoinette",new Date("May", 2, 1959)));
		System.out.print("Added Joe, Andy, Greg, Kiki, ");
		System.out.println("and Antoinette to the map.");

		// Ask the user to type a name.  If found in the map,
		// print it out.
		Scanner keyboard = new Scanner(System.in);
		String name = "";
		do
		{
			System.out.print("\nEnter a name to look up in the map. ");
			System.out.println("Press enter to quit.");
			name = keyboard.nextLine();
			if (employees.containsKey(name))
			{
				Employee e = employees.get(name);
				System.out.println("Name found: " + e.toString());
			}
			else if (!name.equals(""))
			{
				System.out.println("Name not found.");
			}
		} while (!name.equals(""));
	}
}
