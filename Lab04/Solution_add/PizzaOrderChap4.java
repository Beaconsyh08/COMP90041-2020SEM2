/**
 * Question 12
 * <p>
 * The PizzaOrder class allows up to 3 pizzas to be
 * saved in an order.
 * <p>
 * Created: Sat Mar 15 2009
 *
 * @author Kenrick Mock
 * @version 1
 */

public class PizzaOrderChap4 {
    private Pizza pizza1, pizza2, pizza3;
    private int numPizzas;

    public PizzaOrderChap4() {
        numPizzas = 0;
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
    }

    // Sample main
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 0);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 2);
        PizzaOrderChap4 order = new PizzaOrderChap4();
        order.setNumPizzas(2);            // 2 pizzas in the order
        order.setPizza1(pizza1);        // Set first pizza
        order.setPizza2(pizza2);        // Set second pizza
        double total = order.calcTotal();    // Should be 18+20 = 38
        System.out.println("The order total is " + total);
    }

    public void setNumPizzas(int num) {
        numPizzas = num;
    }

    public void setPizza1(Pizza pizza) {
        pizza1 = pizza;
    }

    public void setPizza2(Pizza pizza) {
        pizza2 = pizza;
    }

    public void setPizza3(Pizza pizza) {
        pizza3 = pizza;
    }

    public double calcTotal() {
        double total = 0;
        if (numPizzas >= 1)
            total += pizza1.calcCost();
        if (numPizzas >= 2)
            total += pizza2.calcCost();
        if (numPizzas >= 3)
            total += pizza3.calcCost();
        return total;
    }
} // Question 12
