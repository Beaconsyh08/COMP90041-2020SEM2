package Solutions.Q7;

/**
 * Description
 * This is for Demonstration purpose
 * If you have any confusion, please contact me
 * yuhsong1@unimelb.edu.au
 * yuhsong@student.unimelb.edu.au
 *
 * @author Yuhao Song
 */

public class MultiItemSale {
    private Sale[] sales;
    private int curr;

    public MultiItemSale() {
        this.sales = new Sale[100];
        this.curr = 0;
    }

    public void insertSale(Sale insert) {
        this.sales[this.curr] = insert;
        this.curr++;
    }

    public double computeTotal() {
        double result = 0.0;
        for (int i = 0; i < this.curr; i++) {
            result = result + this.sales[i].bill();
        } // end of for ()

        return result;
    }
}