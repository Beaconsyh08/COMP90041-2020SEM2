public class DisjointSetDemo
{
	public static void main(String[] args)
	{
		DisjointSet set1 = new DisjointSet<String>();
		DisjointSet set2 = new DisjointSet<String>();

		// Save references to objects added to the set so we
		// can query them to determine which set they are in
		DisjointSet<String>.Node<String> tiger = set1.add("tiger");
		DisjointSet<String>.Node<String> lynx = set1.add("lynx");
		DisjointSet<String>.Node<String> cheetah = set1.add("cheetah");

		DisjointSet<String>.Node<String> wolf = set2.add("wolf");
		DisjointSet<String>.Node<String> fox = set2.add("fox");


		System.out.println("Added tiger,cheetah,lynx to set 1.");
		System.out.println("Added wolf, fox to set 2.\n");
		System.out.println(" tiger in set1? " +
			set1.isMemberOf("tiger"));
		System.out.println(" tiger in set2? " +
			set2.isMemberOf("tiger"));

		System.out.println(" cheetah in set1? " +
			set1.isMemberOf("cheetah"));
		System.out.println(" wolf in set2? " +
			set2.isMemberOf("wolf"));
		System.out.println(" fox in set1? " +
			set1.isMemberOf("fox") + "\n");

		System.out.println(" tiger and cheetah in same set? " +
				(tiger.getSet() == cheetah.getSet()));
		System.out.println(" lynx and fox in same set? " +
				(lynx.getSet() == fox.getSet()));
		System.out.println(" wolf and fox in same set? " +
				(wolf.getSet() == fox.getSet()) + "\n");

		System.out.println("Afer union of set1 and set2:\n");
		set1.union(set2);

		System.out.println(" tiger in set2? " +
			set2.isMemberOf("tiger"));
		System.out.println(" fox in set1? " +
			set1.isMemberOf("fox") + "\n");

		System.out.println(" lynx and fox in same set? " +
				(lynx.getSet() == fox.getSet()));
		System.out.println(" wolf and fox in same set? " +
				(wolf.getSet() == fox.getSet()) + "\n");

	}
}