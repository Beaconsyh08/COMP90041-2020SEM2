
import java.text.DecimalFormat;

public class DecimalFormatDemo
{
    public static void main(String[] args)
    {
        DecimalFormat pattern00dot000 = new DecimalFormat("00.000");
        DecimalFormat pattern0dot00 = new DecimalFormat("0.00");

        double d = 12.3456789;
        System.out.println("Pattern 00.000");
        System.out.println(pattern00dot000.format(d));
        System.out.println("Pattern 0.00");
        System.out.println(pattern0dot00.format(d));

        double money = 19.8;
        System.out.println("Pattern 0.00");
        System.out.println("$" + pattern0dot00.format(money));
        
        DecimalFormat percent = new DecimalFormat("0.00%");

        System.out.println("Pattern 0.00%");
        System.out.println(percent.format(0.308));

        DecimalFormat eNotation1 =
           new DecimalFormat("#0.###E0");//1 or 2 digits before point
        DecimalFormat eNotation2 =
           new DecimalFormat("00.###E0");//2 digits before point

        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(123.456));
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(123.456));

        double smallNumber = 0.0000123456;
        System.out.println("Pattern #0.###E0");
        System.out.println(eNotation1.format(smallNumber));
        System.out.println("Pattern 00.###E0");
        System.out.println(eNotation2.format(smallNumber));
    }
}
