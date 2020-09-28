/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class JavaTutorialDriver {
    public static void main(String[] args) {
        // Constructor
        JavaTutorial tutorial1 = new JavaTutorial(1, 100, "yuhao");
        System.out.println(tutorial1);

        JavaTutorial tutorial2 = new JavaTutorial();
        System.out.println(tutorial2);

//         Private & Public
        tutorial1.myMethod(2, "hi");

        // Getter & Setter
//        System.out.println(tutorial1.getStudentNo());
//
//        tutorial1.setStudentNo(1000);
//        System.out.println(tutorial1.getStudentNo());

    }
}
