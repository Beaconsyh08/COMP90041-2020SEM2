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

public class Figure {
    public Figure() {
    }

    public Figure(Figure figure) {
    }

    public void erase() {
        for (int i = 0; i < 5; i++) {
            System.out.println();
        } // end of for ()
    }

    public void draw() {
    }

    public void center() {
        this.erase();
        this.draw();
    }

}// Figure