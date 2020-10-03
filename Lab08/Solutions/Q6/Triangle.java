package Solutions.Q6;

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

    private int height;

    public Triangle() {
        height = 0;
    }

    public Triangle(int height) {
        this.height = height;
    }

    // for drawing purpose, we assume height = base, hard to display by asterisks
    public void draw() {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void erase() {
        super.erase();
    }

}// Triangle