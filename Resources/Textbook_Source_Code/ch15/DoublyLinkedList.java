
public class DoublyLinkedList
{
    private class TwoWayNode
    {
        private String item;
        private TwoWayNode previous;
        private TwoWayNode next;

        public TwoWayNode( )
        {
             item = null;
             next = null;
             previous = null;
        }

        public TwoWayNode(String newItem, TwoWayNode previousNode, TwoWayNode nextNode)
        {
            item = newItem;
            next = nextNode;
            previous = previousNode;
        }
     }//End of TwoWayNode inner class

	public class DoublyLinkedIterator
	{
		// We do not need a previous node when using a doubly linked list
		private TwoWayNode position = null;

		public DoublyLinkedIterator()
		{
			position = head;
		}
		public void restart()
		{
			position = head;
		}
		public String next()
		{
			if (!hasNext())
				throw new IllegalStateException();
			String toReturn = position.item;
			position = position.next;
			return toReturn;
		}
		public boolean hasNext()
		{
			return (position != null);
		}
		public String peek()
		{
			if (!hasNext())
				throw new IllegalStateException();
			return position.item;
		}
		public void insertHere(String newData)
		{
			if (position == null && head != null)
			{
				// add to end of list.  First move a temp
				// pointer to the end of the list
				TwoWayNode temp = head;
				while (temp.next != null)
				{
					temp = temp.next;
				}
				temp.next = new TwoWayNode(newData, temp, null);
			}
			else if (head == null || position.previous == null)
				// at head of list
				DoublyLinkedList.this.addToStart(newData);
			else
			{
				// Insert before the current position
				TwoWayNode temp = new TwoWayNode(newData, position.previous, position);
				position.previous.next = temp;
				position.previous = temp;
			}
		}

		public void delete()
		{
			if (position == null)
				throw new IllegalStateException();
			else if (position.previous == null)
			{
				// Deleting first node
				head = head.next;
				position = head;
			}
			else if (position.next == null)
			{
				// Deleting last node
				position.previous.next = null;
				position = null;
			}
			else
			{
				position.previous.next = position.next;
				position.next.previous = position.previous;
				position = position.next;
			}
		}
	}	// DoublyLinkedIterator

    private TwoWayNode head;

	public DoublyLinkedIterator iterator()
	{
		return new DoublyLinkedIterator();
	}

    public DoublyLinkedList( )
    {
        head = null;
    }

    /**
     Adds a node at the start of the list with the specified data.
     The added node will be the first node in the list.
    */
    public void addToStart(String itemName)
    {
        TwoWayNode newHead = new TwoWayNode(itemName, null, head);
        if (head != null)
        {
	        head.previous = newHead;
		}
        head = newHead;
    }

    /**
     Removes the head node and returns true if the list contains at least
     one node. Returns false if the list is empty.
    */
    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.next;
            return true;
        }
        else
            return false;
    }

    /**
     Returns the number of nodes in the list.
    */
    public int size( )
    {
        int count = 0;
        TwoWayNode position = head;
        while (position != null)
        {
            count++;
            position = position.next;
        }
        return count;
    }


    public void outputList( )
    {
        TwoWayNode position = head;
        while (position != null)
        {
            System.out.println(position.item );
            position = position.next;
        }
    }

    public boolean isEmpty( )
    {
        return (head == null);
    }

    public void clear( )
    {
        head = null;
    }

   /* <
       Other methods would normally be defined here,
        such as an equals, clone, find, or contains methods.
       They have been left off to simplify the example.
      >
   */
}
