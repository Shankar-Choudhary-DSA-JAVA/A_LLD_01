package Day_10_Structural_Decorator_DP_05;

// ButterscotchScoop.java
public class ButterscotchScoop extends IceCreamDecorator {

    public ButterscotchScoop(IceCreamCone iceCream) {
        super(iceCream);
    }

    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getConstituents() {
        return iceCream.getConstituents() + ", Butterscotch";
    }
}