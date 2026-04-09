package Day_10_Structural_Decorator_DP_04;

// Tomato.java
public class Tomato extends PizzaDecorator {

    public Tomato(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato";
    }
}