package Day_10_Structural_Decorator_DP_04;

// Paneer.java
public class Paneer extends PizzaDecorator {

    public Paneer(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 90;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Paneer";
    }
}