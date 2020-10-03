package Demo;

/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoCasting {
    public static void main(String[] args) {
        Animal animal = new Animal();
        // ClassCastException
//        Dog downcastedDog = (Dog) animal;

        Animal cat = new Cat();
        Dog downcastedDog2 = (Dog) cat;

    }

    static class Animal {
    }

    static class Dog extends Animal {
    }

    static class Cat extends Animal {
    }

}
