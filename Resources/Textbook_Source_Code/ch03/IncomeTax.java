
import java.util.Scanner;

public class IncomeTax
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        double netIncome, tax, fivePercentTax, tenPercentTax;

        System.out.println("Enter net income.\n"
                      + "Do not include a dollar sign or any commas.");
        netIncome = keyboard.nextDouble( );

        if (netIncome <= 15000)
            tax = 0;
        else if ((netIncome > 15000) && (netIncome <= 30000))
            //tax = 5% of amount over $15,000
            tax = (0.05*(netIncome - 15000));
        else //netIncome > $30,000
        {
            //fivePercentTax = 5% of income from $15,000 to $30,000.
            fivePercentTax = 0.05*15000;
            //tenPercentTax = 10% of income over $30,000.
            tenPercentTax = 0.10*(netIncome - 30000);
            tax = (fivePercentTax + tenPercentTax);
        }

        System.out.printf("Tax due = $%.2f", tax);
    }
}





