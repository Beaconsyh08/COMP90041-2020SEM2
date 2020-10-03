package Solutions.Q5;

/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

public class Triangle extends Figure {

    private int base;
    private int height;

    public Triangle() {
        // super();
        System.out.println("Creating Triangle Class with no parameters.");
        this.base = 0;
        this.height = 0;
    }

    public Triangle(int base, int height) {
        System.out.println("Creating Triangle Class given base and height.");
        this.base = base;
        this.height = height;
    }

    public void draw() {
        System.out.println("Calling Triangle's draw method.");
    }

    public void erase() {
        System.out.println("Calling Triangle's erase method.");
    }
}// Triangle