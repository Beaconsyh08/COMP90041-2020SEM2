

/**
 Program to show interest on a sample account balance.
 Author: Jane Q. Programmer.
 E-mail Address: janeq@somemachine.etc.etc.
 Last Changed: September 21, 2004.
*/
public class ShowInterest
{
    public static final double INTEREST_RATE = 2.5;
    
    public static void main(String[] args)
    {
        double balance = 100;
        double interest; //as a percent
               
        interest = balance * (INTEREST_RATE/100.0); 
        System.out.println("On a balance of $" + balance);
        System.out.println("you will earn interest of $" 
                                                + interest);
        System.out.println("All in just one short year.");
    }

}


 

