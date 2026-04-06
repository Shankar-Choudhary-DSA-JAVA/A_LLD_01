package Day_10_Structural_Decorator_DP_05;

// VanillaScoop.java
public class VanillaScoop extends IceCreamDecorator {

    public VanillaScoop(IceCreamCone iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getConstituents() {
        return iceCream.getConstituents() + ", Vanilla";
    }
}