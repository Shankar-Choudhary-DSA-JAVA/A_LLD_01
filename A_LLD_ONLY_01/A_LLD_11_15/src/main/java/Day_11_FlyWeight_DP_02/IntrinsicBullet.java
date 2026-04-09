package Day_11_FlyWeight_DP_02;

public class IntrinsicBullet {

    private double radius;
    private double weight;
    private byte[] image;
    private BulletType type;

    public IntrinsicBullet(double radius, double weight, byte[] image, BulletType type) {
        this.radius = radius;
        this.weight = weight;
        this.image = image;
        this.type = type;
    }

    public void display() {
        System.out.println("BulletType: " + type + ", Radius: " + radius);
    }
}