package Day_10_Structural_Decorator_DP_04;

// PlainPizza.java
public class PlainPizza implements Pizza {

    @Override
    public int getCost() {
        return 100; // base price
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}