/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoException {
    public static void main(String[] args) {
        myMethod2();
        System.out.println("Well handled");
    }

    // declare at the method heading
    public static void myMehtod1() throws DemoMyException {
        try {
            throw new DemoMyException("hi exception");  // create an exception object
        } finally {
            System.out.println("Not handled");
        }
//        throw new DemoMyException();
//        System.out.println("Can not go here");
//        throw new DemoMyException();
    }

    public static void myMethod2() {
        try {
            myMehtod1();  // throw the exception
            System.out.println("Can not go here");
        } catch (DemoMyException e) {  // Catch the More Specific Exception First
//            e.printStackTrace();  // Useful for debugging, but not use in production. print out at the end
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Catch any exception");
        } finally {
            System.out.println("But you can go here (optional)");
        }
        System.out.println("finish!");
    }

}
