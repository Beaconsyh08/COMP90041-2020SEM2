/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package Inh;

public class DemoDog extends DemoAnimals {
    private String color;
    private int height;
    private int nonStaticVar = 300;


    // Dog constructor 0
    public DemoDog() {
        this("dog", "python", 5, "red");  // invoke dog con 1
//        this("dog", "python", 5, "red", 10);  // invoke dog con 2
    }

    // Dog constructor 1
    public DemoDog(String spec, String name, int age, String color) {
        super(spec, name, age);  // invoke animals con
        this.color = color;
    }

    // Dog constructor 2
    public DemoDog(String spec, String name, int age, String color, int height) {
        super(spec, name, age);   // invoke animals con
        this.color = color;
        this.height = height;
    }

//    Dog constructor 3
//    public DemoDog(String spec, String name, int age, String color, int height) {
//        this(spec, name, age, color);  // invoke dog con 1
//        this.height = height;
//    }

//    Dog constructor 4
    public DemoDog(int number1) {
        // invoke the no argument cons
        super();
    }

//    public int getNonStaticVar() {
//        return nonStaticVar;
//    }

    @Override
    public DemoDog getObject() {
        return new DemoDog();
    }


    @Override
    public void sleep() {
        System.out.println("Dog sleep");
    }

    //Overloading
    public void sleep(int a) {
        System.out.println("Overload sleep");
    }


//    public static int staticVar = 100; base animal
//    public int nonStaticVar = 200; base animal

//    private int nonStaticVar = 300; derived dog

    public void tryVar() {
        System.out.println("staticVar = " + staticVar);
        System.out.println("nonStaticVar = " + nonStaticVar);
        System.out.println("this.nonStaticVar = " + this.nonStaticVar);
        System.out.println("super.nonStaticVar = " + super.nonStaticVar);
    }

//    DemoDog dog1 = new DemoDog();
//    // different between this and super to access variables
//        dog1.tryVar();


    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                ", Color='" + color + '\'' +
                ", Height=" + height +
                '}';
    }
}
