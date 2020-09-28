
public class RecursionDemo1
{
    public static void main(String[] args)
    {
        System.out.println("writeVertical(3):");
        writeVertical(3);

        System.out.println("writeVertical(12):");
        writeVertical(12);

        System.out.println("writeVertical(123):");
        writeVertical(123);
    }

    public static void writeVertical(int n)
    {
        if (n < 10)
        {
            System.out.println(n);
        }
        else //n is two or more digits long:
        {
            writeVertical(n/10);
            System.out.println(n%10);
        }
    }
}
