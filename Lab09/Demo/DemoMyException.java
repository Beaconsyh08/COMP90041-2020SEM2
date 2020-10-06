/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */

public class DemoMyException extends Exception {
    public DemoMyException() {
        super("Default My Exception Message");
    }

    /**
     * method1
     * @param message
     */
    public DemoMyException(String message) {
        super(message);
    }
}

