

public class UnorderedPairDemo
{
   public static void main(String[] args)
   {
        UnorderedPair<String> p1 = 
             new UnorderedPair<String>("peanuts", "beer");
        UnorderedPair<String> p2 = 
             new UnorderedPair<String>("beer", "peanuts");

        if (p1.equals(p2))
        {
            System.out.println(p1.getFirst( ) + " and " +
                      p1.getSecond( ) + " is the same as");
            System.out.println(p2.getFirst( ) + " and "
                                + p2.getSecond( ));
        }
   }
}
