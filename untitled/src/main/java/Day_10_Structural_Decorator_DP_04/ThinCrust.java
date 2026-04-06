package Day_10_Structural_Decorator_DP_04;

// ThinCrust.java
public class ThinCrust extends PizzaDecorator {

    public ThinCrust(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Thin Crust";
    }
}