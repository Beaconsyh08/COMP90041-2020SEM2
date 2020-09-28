/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */

import java.util.Arrays;

public class DemoArrayObject {
    public static void main(String[] args) {
        JavaTutorial[] tutorialArray = new JavaTutorial[5];

        System.out.println(Arrays.toString(tutorialArray));

//        NullPointerException
//        System.out.println(tutorialArray[0].studentNo);

        // initial the JavaTutorial Object
        tutorialArray[0] = new JavaTutorial(1, 20, "Yuhao");
        tutorialArray[3] = new JavaTutorial(2, 15, "Yuhao");
        System.out.println(Arrays.toString(tutorialArray));
    }

    static class JavaTutorial {
        int tutorialNo;
        int studentNo;
        String tutorName;

        public JavaTutorial(int tutorialNo, int studentNo, String tutorName) {
            this.tutorialNo = tutorialNo;
            this.studentNo = studentNo;
            this.tutorName = tutorName;
        }

        @Override
        public String toString() {
            return "JavaTutorial{" +
                    "tutorialNo=" + tutorialNo +
                    ", studentNo=" + studentNo +
                    ", tutorName='" + tutorName + '\'' +
                    '}';
        }
    }
}
