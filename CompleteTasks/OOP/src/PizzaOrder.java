public class PizzaOrder {

    public String pizzaName;

    public Size size;

    public boolean souse;

    public boolean accept;

    enum Size {
        SMALL,
        MEDIUM,
        BIG
    }

    public String getPizzaName() { return pizzaName; }
    public Size getSize() { return size; }
    public boolean getSouse() { return souse; }
    public boolean getAccept() { return accept; }

    public void setPizzaName(String name) {
        this.pizzaName = name;
    }
    public void setSize(Size size) {
        this.size = size;
    }
    public void setSouse(boolean souse) {
        this.souse = souse;
    }

    public PizzaOrder(String pizzaName, Size size, boolean souse){
        this.pizzaName = pizzaName;
        this.size = size;
        this.souse = souse;
        this.accept = false;
    }

    public void order() {
        if (accept == false) {
            accept = true;
            if (souse == true)
                System.out.println("Order accepted. " + size + " Pizza " + pizzaName + " with souse was sent to " + "ADDRESS");
            else
                System.out.println("Order accepted. " + size + " Pizza " + pizzaName + " was sent to " + "ADDRESS");
        }
        else
            System.out.println("The order has already been sent");
    }

    public void cancel() {
        System.out.println("Order cancelled");
    }

    public String toString() {
        return pizzaName + " " + size + " " + souse + " " + accept;
    }
}
