
public class LinkedList2
{
    private class Node
    {
        private String item;
        private Node link;

        public Node( )
        {
             item = null;
             link = null;
        }

        public Node(String newItem, Node linkValue)
        {
            item = newItem;
            link = linkValue;
        }
     }//End of Node inner class

    private Node head;

    public LinkedList2( )
    {
        head = null;
    }

    /**
     Adds a node at the start of the list with the specified data.
     The added node will be the first node in the list.
    */
    public void addToStart(String itemName)
    {
        head = new Node(itemName, head);
    }

    /**
     Removes the head node and returns true if the list contains at least
     one node. Returns false if the list is empty.
    */
    public boolean deleteHeadNode( )
    {
        if (head != null)
        {
            head = head.link;
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
        Node position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(String item)
    {
        return (find(item) != null);
    }

    /**
     Finds the first node containing the target item, and returns a
     reference to that node. If target is not in the list, null is returned.
    */
    private Node find(String target)
    {
        Node position = head;
        String itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.item;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; //target was not found
    }

    public void outputList( )
    {
        Node position = head;
        while (position != null)
        {
            System.out.println(position.item );
            position = position.link;
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


   /*
    For two lists to be equal they must contain the same data items in
    the same order.
   */
   public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList2 otherList = (LinkedList2)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node position = head;
            Node otherPosition = otherList.head;
            while (position != null)
            {
                if ( (!(position.item.equals(otherPosition.item))))
                   return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; //A mismatch was not found
        }
    }

}
