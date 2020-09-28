public class HashTableDemo
{
	public static void main(String[] args)
	{
		HashTable h = new HashTable();

		System.out.println("Adding dog, cat, turtle, bird");
		h.put("dog");
		h.put("cat");
		h.put("turtle");
		h.put("bird");
		System.out.println("Dog in hash table? " + h.containsString("dog"));
		System.out.println("Cat in hash table? " + h.containsString("cat"));
		System.out.println("Turtle in hash table? " + h.containsString("turtle"));
		System.out.println("Bird in hash table? " + h.containsString("bird"));

		System.out.println("Fish in hash table? " + h.containsString("fish"));
		System.out.println("Cow in hash table? " + h.containsString("cow"));
	}
}