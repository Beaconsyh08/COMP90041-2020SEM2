/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package OverRidLoad;

public class DemoOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.p(10);
        a.p(10.0);
//
//        B b = new B();
//        b.p(10);
//        b.p(10.0);
    }
}

class B {
    public void p(double i) {
        System.out.println(i * 2);
    }
}

class A extends B {
    // overrides the method in B
    @Override
    public void p(double i) {
        System.out.println(i);
    }
}