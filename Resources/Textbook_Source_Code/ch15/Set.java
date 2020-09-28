// Uses a linked list as the internal data structure
// to store items in a set.
public class Set<T>
{
    private class Node<T>
    {
        private T data;
        private Node<T> link;

        public Node( )
        {
             data = null;
             link = null;
        }

        public Node(T newData, Node<T> linkValue)
        {
            data = newData;
            link = linkValue;
        }
     }//End of Node<T> inner class

    private Node<T> head;

	public Set()
	{
		 head = null;
	}

	/**
	 Add a new item to the set.  If the item
	 is already in the set, false is returned,
	 otherwise true is returned.
	*/
	public boolean add(T newItem)
	{
		if (!contains(newItem))
		{
			head = new Node<T>(newItem, head);
			return true;
		}
		return false;
	}

    public boolean contains(T item)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(item))
                return true;
            position = position.link;
        }
        return false; //target was not found
    }

    public void output( )
    {
        Node position = head;
        while (position != null)
        {
            System.out.print(position.data.toString() + " ");
            position = position.link;
        }
        System.out.println();
    }

	/**
	 Returns a new set that is the union
	 of this set and the input set.
	*/
	public Set<T> union(Set<T> otherSet)
	{
		Set<T> unionSet = new Set<T>();
		// Copy this set to unionSet
		Node<T> position = head;
		while (position != null)
		{
			unionSet.add(position.data);
			position = position.link;
		}
		// Copy otherSet items to unionSet.
		// The add method eliminates any duplicates.
		position = otherSet.head;
		while (position != null)
		{
			unionSet.add(position.data);
			position = position.link;
		}
		return unionSet;
	}

	 /**
	  Returns a new that is the intersection
	  of this set and the input set.
	 */
	 public Set<T> intersection(Set<T> otherSet)
	 {
		 Set<T> interSet = new Set<T>();
		 // Copy only items in both sets
		Node<T> position = head;
		while (position != null)
		{
			if (otherSet.contains(position.data))
				interSet.add(position.data);
			position = position.link;
		}
		return interSet;
	 }

	 /**
	  The clear, size, and isEmpty methods are identical
	  to those in Display 15.8 for the LinkedList3 class.
	 */
}