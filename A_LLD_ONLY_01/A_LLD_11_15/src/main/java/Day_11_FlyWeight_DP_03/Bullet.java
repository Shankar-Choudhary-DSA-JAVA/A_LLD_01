package Day_11_FlyWeight_DP_03;

public class Bullet {

    private final BulletType type;
    private final String color;
    private final byte[] image;

    public Bullet(BulletType type, String color, byte[] image) {
        this.type = type;
        this.color = color;
        this.image = image;
    }

    public BulletType getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public byte[] getImage() {
        return image;
    }

    // Derived from enum
    public double getRadius() {
        return type.getRadius();
    }

    public double getWeight() {
        return type.getWeight();
    }
}