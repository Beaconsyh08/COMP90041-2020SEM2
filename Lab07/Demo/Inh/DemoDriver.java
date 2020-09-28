/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package Inh;

public class DemoDriver {
    public static void main(String[] args) {
//        DemoDog dog1 = new DemoDog();
        // different between this and super to access variables
//        dog1.tryVar();
//        System.out.println(dog1.getNonStaticVar());
//         overridden method invocation
//        dog1.sleep();
//        dog1.sleep(1);
//        System.out.println(dog1);

//         late binding
//        int a = 1;
//        System.out.println(a);
//        a = 2;
//        System.out.println(a);

        DemoDog dog2 = new DemoDog(5);
        System.out.println(dog2);
    }
}
