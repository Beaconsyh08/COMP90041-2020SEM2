/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public abstract class DemoAbstractAnimal {
    int a = 0;

    public DemoAbstractAnimal() {
    }

    public DemoAbstractAnimal(int a) {
        this.a = a;
    }

    public static void main(String[] args) {
        // You Cannot Create Instances of an Abstract Class
//        DemoAbstractAnimal aa = new DemoAbstractAnimal();
//

        DemoDog dog = new DemoDog();
        dog.desc();

    }

    public abstract void sleep(int a, String b);

    public abstract void eat(int a, String b);

    public abstract void eat(int a, String b, String c);

    // non abstract method
    public void desc() {
        System.out.println("Hello from animal class");
    }

}

class DemoDog extends DemoAbstractAnimal implements DemoAnimalActions {

    // Abstract class


    public DemoDog() {
    }

    public DemoDog(int a) {
        super(a);
    }

    @Override
    public void sleep(int a, String b) {

    }

    @Override
    public void eat(int a, String b) {

    }

    @Override
    public void eat(int a, String b, String c) {
    }


    // Interface
    @Override
    public void sound(String c) {

    }

    @Override
    public void alive(int a) {

    }

}
