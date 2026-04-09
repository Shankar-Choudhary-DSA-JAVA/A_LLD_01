package Day_10_Structural_Decorator_DP_04;

// Cheese.java
public class Cheese extends PizzaDecorator {

    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 70;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }
}