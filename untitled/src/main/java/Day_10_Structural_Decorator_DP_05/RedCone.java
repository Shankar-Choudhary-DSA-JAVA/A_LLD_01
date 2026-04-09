package Day_10_Structural_Decorator_DP_05;

// Cone.java
public class RedCone implements IceCreamCone {

    @Override
    public int getCost() {
        return 10; // base cost
    }

    @Override
    public String getConstituents() {
        return "Cone";
    }
}