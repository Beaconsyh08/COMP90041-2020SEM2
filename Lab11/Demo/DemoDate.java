/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoDate {
    int /*@spec_public@*/ day;
    int /*@spec_public@*/ hour;

    /*@invariant day >= 1 && day <= 31; @*/ //class invariant
    /*@invariant hour >= 0 && hour <= 23; @*/ //class invariant

    /*@
    @requires d >= 1 && d <= 31;
    @requires h >= 0 && h <= 23;
    @*/
    public DemoDate(int d, int h) { // constructor
        day = d;
        hour = h;
    }

    public static void main(String[] args) {
        DemoDate t1 = new DemoDate(0, -1);
        System.out.println(t1);
    }

    /*@
    @requires d >= 1 && d <= 31;
    @ensures day == d;
    @*/
    public void setDay(int d) {
        day = d;
    }

    /*@
    @requires h >= 0 && h <= 23;
    @ensures hour == h;
    @*/
    public void setHour(int h) {
        hour = h;
    }
}