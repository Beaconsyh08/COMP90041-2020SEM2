
public class BankAccountDemo
{
    public static void main(String[] args)
    {
        System.out.println("Creating a new account.");
        BankAccount account = new BankAccount( );
        System.out.println("Account balance now = $" 
                                          + account.getBalance( ));

        System.out.println("Depositing $100.00");
        account.makeDeposit("100.00");
        System.out.println("Account balance now = $" 
                                          + account.getBalance( ));

        System.out.println("Depositing $99.99");
        account.makeDeposit("99.99");
        System.out.println("Account balance now = $" 
                                          + account.getBalance( ));

        System.out.println("Depositing $0.01");
        account.makeDeposit("0.01");
        System.out.println("Account balance now = $" 
                                          + account.getBalance( ));

        System.out.println("Closing account.");
        account.closeAccount( );
        System.out.println("Account balance now = $" 
                                          + account.getBalance( ));
    }
}
 