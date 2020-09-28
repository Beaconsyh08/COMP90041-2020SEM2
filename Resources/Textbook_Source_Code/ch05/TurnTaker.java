
public class TurnTaker
{
    private static int turn = 0;

    private int myTurn;
    private String name;

    public TurnTaker(String theName, int theTurn)
    {
        name = theName;
        if (theTurn >= 0)
            myTurn = theTurn;
        else
        {
            System.out.println("Fatal Error.");
            System.exit(0);
        }
    }

    public TurnTaker( )
    {
        name = "No name yet";
        myTurn = 0;//Indicating no turn.
    }

    public String getName( )
    {
        return name;
    }

    public static int getTurn( )
    {
        turn++;
        return turn;
    }

    public boolean isMyTurn( )
    {
        return (turn == myTurn);
    }
}
