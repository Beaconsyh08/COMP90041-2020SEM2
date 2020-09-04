/**
 * Question 8
 * <p>
 * Modification to the PizzaOrder class.
 * Requires the Pizza class from PP 4.11.
 * <p>
 * Created: Sat Mar 15 2009
 *
 * @author Kenrick Mock
 * @version 1
 */

public class PizzaOrder {
    private Pizza pizza1, pizza2, pizza3;
    private int numPizzas;

    public PizzaOrder() {
        numPizzas = 0;
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
    }

    // Copy constructor
    public PizzaOrder(PizzaOrder order) {
        numPizzas = order.numPizzas;
        pizza1 = null;
        pizza2 = null;
        pizza3 = null;
        // Make copies of the Pizza objects
        Pizza orig = order.getPizza1();
        if (orig != null) {
            pizza1 = new Pizza(orig.getSize(),
                    orig.getNumCheeseToppings(),
                    orig.getNumHamToppings(),
                    orig.getNumPepperoniToppings());
        }
        orig = order.getPizza2();
        if (orig != null) {
            pizza2 = new Pizza(orig.getSize(),
                    orig.getNumCheeseToppings(),
                    orig.getNumHamToppings(),
                    orig.getNumPepperoniToppings());
        }
        orig = order.getPizza3();
        if (orig != null) {
            pizza3 = new Pizza(orig.getSize(),
                    orig.getNumCheeseToppings(),
                    orig.getNumHamToppings(),
                    orig.getNumPepperoniToppings());
        }
    }

    // Sample main
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("Large", 1, 1, 0);
        Pizza pizza2 = new Pizza("Medium", 2, 0, 2);
        PizzaOrder order1 = new PizzaOrder();
        order1.setNumPizzas(2);
        order1.setPizza1(pizza1);
        order1.setPizza2(pizza2);
        double total = order1.calcTotal();    // Should be 38
        System.out.println("Total of original order: " +
                total);

        // Copy the order
        PizzaOrder order2 = new PizzaOrder(order1);
        // Change one topping to new order
        order2.getPizza1().setNumCheeseToppings(3);
        total = order2.calcTotal();
        // total should be 22 + 20 = 44
        double origTotal = order1.calcTotal();
        // origTotal should still be 38

        System.out.println("Total of copied and " +
                "modified order: " + total);
        System.out.println("Original total unchanged at: " +
                origTotal);
    }

    public int getNumPizzas() {
        return numPizzas;
    }

    public void setNumPizzas(int num) {
        numPizzas = num;
    }

    public Pizza getPizza1() {
        if (numPizzas > 0)
            return pizza1;
        else
            return null;
    }

    public void setPizza1(Pizza pizza) {
        pizza1 = pizza;
    }

    public Pizza getPizza2() {
        if (numPizzas > 1)
            return pizza2;
        else
            return null;
    }

    public void setPizza2(Pizza pizza) {
        pizza2 = pizza;
    }

    public Pizza getPizza3() {
        if (numPizzas > 2)
            return pizza3;
        else
            return null;
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
} // Question 8
