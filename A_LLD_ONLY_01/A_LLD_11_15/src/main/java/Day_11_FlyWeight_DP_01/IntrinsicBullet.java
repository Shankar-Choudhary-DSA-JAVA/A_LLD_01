package Day_11_FlyWeight_DP_01;

// IntrinsicBullet.java
public class IntrinsicBullet {

    private double radius;
    private double weight;
    private int type;
    private byte[] image; // heavy object (1KB)

    public IntrinsicBullet(double radius, double weight, int type, byte[] image) {
        this.radius = radius;
        this.weight = weight;
        this.type = type;
        this.image = image;
    }

    public byte[] getImage() {
        return image;
    }

    public int getType() {
        return type;
    }
}