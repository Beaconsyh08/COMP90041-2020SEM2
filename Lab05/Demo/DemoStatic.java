/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoStatic {
    public static int courseCode = 90041;

    private int tutorialNo;

    // Constructor
    public DemoStatic(int tutorialNo) {
        this.tutorialNo = tutorialNo;
    }

    // Static methods
    public static int displaySt() {
        return courseCode;
    }

    public static void changeSt(int courseCode) {
        DemoStatic.courseCode = courseCode;
    }

    public int getTutorialNo() {
        return tutorialNo;
    }

    public void setTutorialNo(int tutorialNo) {
        this.tutorialNo = tutorialNo;
    }
}

