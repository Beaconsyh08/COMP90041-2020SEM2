public class DoublyLinkedDemo
{
	/**
	  The following method demonstrates use of the doubly linked list
	*/
	public static void main(String[] args)
	{
		DoublyLinkedList list = new DoublyLinkedList();
		DoublyLinkedList.DoublyLinkedIterator i = list.iterator();

		list.addToStart("shoes");
		list.addToStart("orange juice");
		list.addToStart("coat");

		System.out.println("List contains");
		i.restart();
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();

		i.restart();
		i.next();
		i.next();
		System.out.println("Delete " + i.peek());
		i.delete();

		System.out.println("List now contains");
		i.restart();
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();

		i.restart();
		i.next();
		System.out.println("Inserting socks before " + i.peek());
		i.insertHere("socks");

		i.restart();
		System.out.println("List now contains");
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();
	}
}