/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package OverRidLoad;

public class DemoOverloading {
    public static void main(String[] args) {
        C c = new C();
        c.p(10);
        c.p(10.0);
    }
}

class D {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class C extends D {
    // overloads the method in D
    public void p(int i) {
        System.out.println(i);
    }
}