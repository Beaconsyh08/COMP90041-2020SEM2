/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
package Inh;

public class DemoAnimals {
    public static int staticVar = 100;
    public int nonStaticVar = 200;

    // not inh for private
    private String name;
    private int age;
    private String spec;
    public int xxx;

    // self-defined cons
    public DemoAnimals(String spec, String name, int age) {
        this.spec = spec;
        this.name = name;
        this.age = age;
    }

    // no-arguments
    public DemoAnimals() {
        this.spec = "secret";
        this.name = "surprise";
        this.age = 9999;
    }


    protected DemoAnimals getObject(){
        return new DemoAnimals("animals", "animal object", 10);
    }

    public void sleep() {
        System.out.println("Animal sleep");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String getSpec() {
        return spec;
    }

    private void setSpec(String spec) {
        this.spec = spec;
    }

    public int getNonStaticVar() {
        return nonStaticVar;
    }

    @Override
    public String toString() {
        return "DemoAnimals{" +
                "nonStaticVar=" + nonStaticVar +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", spec='" + spec + '\'' +
                '}';
    }
}
