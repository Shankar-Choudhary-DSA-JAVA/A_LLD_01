package Day_11_FlyWeight_DP_04;

public class Bullet {

    private final BulletType type;
    private final String color;
    private final byte[] image;

    public Bullet(BulletType type, String color, byte[] image) {
        this.type = type;
        this.color = color;
        this.image = image;

        // 🔥 Debug: Track object creation
        System.out.println("✅ Bullet Created: " + this + " Type: " + type);
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

    public double getRadius() {
        return type.getRadius();
    }

    public double getWeight() {
        return type.getWeight();
    }
}