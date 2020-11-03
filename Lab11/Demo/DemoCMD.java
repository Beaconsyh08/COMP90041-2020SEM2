import java.io.IOException;
/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoCMD {
    public static void main(String[] args) {


//        for (String cmdInput: args) {
//            System.out.println(cmdInput);
//        }

        if (args[0].equals("-s")) {
            System.out.println(args[1]);
        } else if (args[0].equals("-i")){
            try {
                System.out.println(Integer.parseInt(args[1]));
            } catch (NumberFormatException e) {
                System.err.println("Argument: " + args[1] + " must be an integer.");
            }
        } else {
            System.out.println("Wrong flag: " + args[0]);
        }
    }


//    public int method1(int a, String b) throws IOException, ArrayIndexOutOfBoundsException {
//        return 0;
//    }
}
