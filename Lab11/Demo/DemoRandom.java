import java.util.Random;
/*
  Description
  This is for Demonstration purpose
  If you have any confusion, please contact me
  yuhsong1@unimelb.edu.au
  yuhsong@student.unimelb.edu.au

  @author Yuhao Song
 */
public class DemoRandom {

    public static void main(String[] args) {

        // create random object
        Random random = new Random();

        // return the next pseudorandom integer value
        System.out.println("Random Integer value : " + random.nextInt(10));  // 0 - 9

        // setting seed
        long seed = 33;

        random.setSeed(seed);

        // value after setting seed
        System.out.println("Random Integer value : " + random.nextInt(10));
    }
}
