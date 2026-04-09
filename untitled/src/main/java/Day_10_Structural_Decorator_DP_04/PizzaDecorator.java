package Day_10_Structural_Decorator_DP_04;

// PizzaDecorator.java
public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}