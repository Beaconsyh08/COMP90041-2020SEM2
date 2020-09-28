public class DisjointSet<T>
{
	// Inner Node class; public to allow for references outside
	// the class
	public class Node<T>
	{
		private T item;
		private Node head;
		private Node next;

		public Node( )
		{
			 item = null;
			 head = null;
			 next = null;
		}
		public Node(T newItem, Node newHead, Node newNext)
		{
			item = newItem;
			head = newHead;
			next = newNext;
		}
		/**
		  Returns a reference to the head node.
		  This reference is used to represent which set
		  the node is in.
		*/
		public Node<T> getSet()
		{
			return head;
		}
	} //End of Node inner class

	private Node<T> head;
	private Node<T> tail;

	public DisjointSet()
	{
		head = null;
		tail = null;
	}
	/**
	 Add a new node to the set.  The method returns a reference
	 to the newly created node from which the getSet() method
	 can be invoked to see what set the node is in.
	*/
	public Node<T> add(T newItem)
	{
		Node<T> newNode;
		if (head == null)
		{	// First node, make head reference itself,
			// next reference null
			newNode = new Node<T>(newItem, null, null);
			newNode.head = newNode;
			head = newNode;
			tail = newNode;
		}
		else
		{	// Add new node on to the tail
			newNode = new Node<T>(newItem, head, null);
			tail.next = newNode;
			tail = newNode;
		}
		return newNode;
	}
	/**
	 Returns true if target is in the set, false otherwise
	*/
	public boolean isMemberOf(T target)
	{
		Node<T> temp = head;
		while (temp != null)
		{	// equals must be defined for type T
			if (temp.item.equals(target))
				return true;
			temp = temp.next;
		}
		return false;
	}
	/**
	 Performs a union operation.
 	 This operation will union both sets together.
 	 After this operation both sets are identical.
	*/
	public void union(DisjointSet otherSet)
	{
		Node<T> temp = otherSet.head;
		// Set the reference of every head node in
		// otherSet to the head node of this set
		while (temp != null)
		{
			temp.head = this.head;
			temp = temp.next;
		}
		// Link otherSet's list to the tail of this
		// list
		if (tail != null)
		{
			this.tail.next = otherSet.head;
			this.tail = otherSet.tail;
			otherSet.head = this.head;
		}
		else
		{	// this set was empty
			this.head = otherSet.head;
			this.tail = otherSet.tail;
		}
	}
}