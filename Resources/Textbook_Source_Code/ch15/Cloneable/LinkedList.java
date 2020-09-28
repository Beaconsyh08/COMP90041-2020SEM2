

public class LinkedList<T extends PubliclyCloneable>
                                         implements PubliclyCloneable
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

    public LinkedList( )
    {
        head = null;
    }

    /**
     Produces a new linked list, but it is not a true deep copy.
     Throws a NullPointerException if other is null.
   */
    public LinkedList(LinkedList<T> otherList)
    {
        if (otherList == null)
            throw new NullPointerException( );
        if (otherList.head == null)
            head = null;
        else
            head = copyOf(otherList.head);
    }


    public LinkedList<T> clone( )
    {
        try
        {
            LinkedList<T> copy =
                              (LinkedList<T>)super.clone( );
            copy.head = copyOf(head);
            return copy;
        }
        catch(CloneNotSupportedException e)
        {//This should not happen.
            return null; //To keep the compiler happy.
        }
    }

     /*
      Precondition: otherHead != null
      Returns a reference to the head of a copy of the list
      headed by otherHead. Returns a true deep copy.
    */
    private Node<T> copyOf(Node<T> otherHead)
    {
        Node<T> position = otherHead;//moves down other's list.
        Node<T> newHead; //will point to head of the copy list.
        Node<T> end = null; //positioned at end of new growing list.

        //Create first node:
        newHead =
              new Node<T>((T)(position.data).clone( ), null);
              end = newHead;
        position = position.link;

        while (position != null)
        {//copy node at position to end of new list.
            end.link =
                new Node<T>((T)(position.data).clone( ), null);
            end = end.link;
            position = position.link;
        }

        return newHead;
    }

    public boolean equals(Object otherObject)
    {
        if (otherObject == null)
            return false;
        else if (getClass( ) != otherObject.getClass( ))
            return false;
        else
        {
            LinkedList<T> otherList = (LinkedList<T>)otherObject;
            if (size( ) != otherList.size( ))
                return false;
            Node<T> position = head;
            Node<T> otherPosition = otherList.head;
            while (position != null)
            {
                if (!(position.data.equals(otherPosition.data)))
                    return false;
                position = position.link;
                otherPosition = otherPosition.link;
            }
            return true; //no mismatch was not found
        }

    }

    public String toString( )
    {
        Node<T> position = head;
        String theString = "";
        while (position != null)
        {
            theString = theString + position.data + "\n";
            position = position.link;
        }
        return theString;
    }

    /**
     Adds a node at the start of the list with the specified data.
     The added node will be the first node in the list.
    */
    public void addToStart(T itemData)
    {
        head = new Node<T>(itemData, head);
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
        Node<T> position = head;
        while (position != null)
        {
            count++;
            position = position.link;
        }
        return count;
    }

    public boolean contains(T item)
    {
        return (find(item) != null);
    }

    /**
     Finds the first node containing the target item, and returns a
     reference to that node. If target is not in the list, null is returned.
    */
    private Node<T> find(T target)
    {
        Node<T> position = head;
        T itemAtPosition;
        while (position != null)
        {
            itemAtPosition = position.data;
            if (itemAtPosition.equals(target))
                return position;
            position = position.link;
        }
        return null; //target was not found
    }

    /**
     Finds the first node containing the target and returns a reference
      to the data in that node. If target is not in the list, null is returned.
    */
    public T findData(T target)
    {
        return find(target).data;
    }

    public void outputList( )
    {
        Node<T> position = head;
        while (position != null)
        {
            System.out.println(position.data);
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


}