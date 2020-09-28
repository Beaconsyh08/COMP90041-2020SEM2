/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class JavaTutorial {
    // the types of data that an object can contain
    private int tutorialNo, studentNo;
    private String tutorName;

    // Default no-argument constructor
    public JavaTutorial(){
    }


    public JavaTutorial(int tutorialNo, int studentNo, String tutorName) {
        this.tutorialNo = tutorialNo;
        this.studentNo = studentNo;
        this.tutorName = tutorName;
    }

    public JavaTutorial(int tutorialNo, int studentNo){
        this.tutorialNo = tutorialNo;
        this.studentNo = studentNo;
    }

    // actions or methods
    public int myMethod(int number1, String text1){
        myMehtod2(5);
        return 0;
    }

    private void myMehtod2(int number2) {

    }

    public int getTutorialNo() {
        return tutorialNo;
    }

    public void setTutorialNo(int tutorialNo) {
        this.tutorialNo = tutorialNo;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public String getTutorName() {
        return tutorName;
    }

    public void setTutorName(String tutorName) {
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
