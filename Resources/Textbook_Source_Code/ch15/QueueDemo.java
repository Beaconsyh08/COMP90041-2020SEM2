
public class QueueDemo
{
    public static void main(String[] args)
    {
        Queue q = new Queue( );

        q.addToBack("Tom");
        q.addToBack("Dick");
        q.addToBack("Harriet");

        while(!q.isEmpty( ))
        {
            System.out.println(q.whoIsNext( ));
            q.removeFront( );
        }
        System.out.println("The queue is empty.");
    }
}
