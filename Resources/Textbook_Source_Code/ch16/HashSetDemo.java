import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo
{
	private static void outputSet(HashSet<String> set)
	{
		Iterator<String> i = set.iterator( );
		while (i.hasNext( ))
			System.out.print(i.next( ) + " ");
		System.out.println();
	}

	public static void main(String[] args)
	{
		HashSet<String> round = new HashSet<String>( );
		HashSet<String> green = new HashSet<String>( );

		// Add some data to each set
		round.add("peas");
		round.add("ball");
		round.add("pie");
		round.add("grapes");

		green.add("peas");
		green.add("grapes");
		green.add("garden hose");
		green.add("grass");

		System.out.println("Contents of set round: ");
		outputSet(round);
		System.out.println("\nContents of set green: ");
		outputSet(green);

		System.out.println("\nball in set 'round'? " +
			round.contains("ball"));
		System.out.println("ball in set 'green'? " +
			green.contains("ball"));

		System.out.println("\nball and peas in same set? " +
			((round.contains("ball") &&
			 (round.contains("peas"))) ||
		      (green.contains("ball") &&
			 (green.contains("peas")))));
		System.out.println("pie and grass in same set? " +
			((round.contains("pie") &&
			 (round.contains("grass"))) ||
				(green.contains("pie") &&
			 (green.contains("grass")))));

		// To union two sets we use the addAll method.
		HashSet<String> setUnion = new HashSet<String>(round);
		round.addAll(green);
		System.out.println("\nUnion of green and round:");
		outputSet(setUnion);

		// To intersect two sets we use the removeAll method.
		HashSet<String> setInter = new HashSet<String>(round);
		setInter.removeAll(green);
		System.out.println("\nIntersection of green and round:");
		outputSet(setInter);
		System.out.println();
	}
}