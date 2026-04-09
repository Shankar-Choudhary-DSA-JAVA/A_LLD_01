package Day_10_Structural_Decorator_DP_05;

// ChocolateScoop.java
public class ChocolateScoop extends IceCreamDecorator {

    public ChocolateScoop(IceCreamCone iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 25;
    }

    @Override
    public String getConstituents() {
        return iceCream.getConstituents() + ", Chocolate";
    }
}