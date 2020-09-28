
public class ParametersDemo
{
    public static void main(String[] args)
    {
        ToyClass2 object1 = new ToyClass2( ), 
                  object2 = new ToyClass2( );
        object1.set("Scorpius", 1);
        object2.set("John Crichton", 2);
        System.out.println("Value of object2 before call to method:");
        System.out.println(object2);
        object1.makeEqual(object2);
        System.out.println("Value of object2 after call to method:");
        System.out.println(object2);

        int aNumber = 42;
        System.out.println(
                      "Value of aNumber before call to method: "
                     + aNumber);
        object1.tryToMakeEqual(aNumber);
        System.out.println(
                      "Value of aNumber after call to method: "
                     + aNumber);
    }
}
