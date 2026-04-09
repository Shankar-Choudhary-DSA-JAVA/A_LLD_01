package Day_10_Structural_Decorator_DP_05;

// IceCreamDecorator.java
public abstract class IceCreamDecorator implements IceCreamCone {

    public IceCreamCone iceCream;

    public IceCreamDecorator(IceCreamCone iceCream) {

        this.iceCream = iceCream;
    }
}