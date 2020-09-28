
public class GenericLinkedListDemo
{
    public static void main(String[] args)
    {
        LinkedList3<Entry> list = new LinkedList3<Entry>( );

        Entry entry1 = new Entry("Apples", 1);
        list.addToStart(entry1);
        Entry entry2 = new Entry("Bananas", 2);
        list.addToStart(entry2);
        Entry entry3 = new Entry("Cantaloupe", 3);
        list.addToStart(entry3);
        System.out.println("List has " + list.size( ) 
                            + " nodes.");
        list.outputList( );
        System.out.println("End of list.");
    }
}
