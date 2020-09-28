/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoObject {

}

class DemoObjectDriver {
    public static void main(String[] args) {
        DemoObject o1 = new DemoObject();
        System.out.println(o1.getClass());
        System.out.println(o1 instanceof Object);
    }
}