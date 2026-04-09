package Day_11_FlyWeight_DP_04;

public enum BulletType {

    FIVE_FIVE_MM(5.5, 10.0),
    SIX_MM(6.0, 12.0),
    SEVEN_MM(7.0, 15.0);

    private final double radius;
    private final double weight;

    BulletType(double radius, double weight) {
        this.radius = radius;
        this.weight = weight;
    }

    public double getRadius() {
        return radius;
    }

    public double getWeight() {
        return weight;
    }
}