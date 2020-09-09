import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */
public class DemoStaticDriver {
    public static void main(String[] args) {
        // no object create

        System.out.println("Display: " + DemoStatic.displaySt());
        DemoStatic.changeSt(90038);
        System.out.println("Display: " + DemoStatic.displaySt());

        DemoStatic tutorial1 = new DemoStatic(1);
        DemoStatic tutorial2 = new DemoStatic(2);
        System.out.println(tutorial1.getTutorialNo());
        System.out.println(tutorial2.getTutorialNo());
////
        System.out.println("DemoStatic.courseCode = " + DemoStatic.courseCode);
        DemoStatic.courseCode = 90000;
        System.out.println("DemoStatic.courseCode = " + DemoStatic.courseCode);
////
        // Actually you could do these without any errors, but not recommend
        System.out.println(tutorial1.displaySt());
        System.out.println(tutorial1.courseCode);
    }
}
