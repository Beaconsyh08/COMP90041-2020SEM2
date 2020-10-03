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

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle() {
        System.out.println("Creating Rectangle Class with no parameters.");
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int width, int height) {
        System.out.println("Creating Rectangle Class given width and height.");
        this.width = width;
        this.height = height;
    }

    public void draw() {
        System.out.println("Calling Rectangle's draw method.");
    }

    public void erase() {
        System.out.println("Calling Rectangle's erase method.");
    }

}// Rectangle