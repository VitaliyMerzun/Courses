
public class PizzaOrderTest {

    public static void main(String[] args) {
       PizzaOrder order1 = new PizzaOrder( "Pepperoni", PizzaOrder.Size.BIG , true);

       order1.order();

       order1.cancel();

       System.out.println(order1.toString());
    }
}
