package Day_11_FlyWeight_DP_00;

public class Bullet {

    // Intrinsic
    private double radius;
    private double weight;
    private String color;
    private byte[] image;
    private BulletType type;

    // Extrinsic
    private double x, y, z;
    private double dx, dy, dz;
    private double speed;
    private BulletStatus status;
    private long userId;

    public Bullet(double radius, double weight, String color, byte[] image,
                  BulletType type,
                  double x, double y, double z,
                  double dx, double dy, double dz,
                  double speed, BulletStatus status, long userId) {

        this.radius = radius;
        this.weight = weight;
        this.color = color;
        this.image = image;
        this.type = type;

        this.x = x;
        this.y = y;
        this.z = z;

        this.dx = dx;
        this.dy = dy;
        this.dz = dz;

        this.speed = speed;
        this.status = status;
        this.userId = userId;
    }

    public void display() {
        System.out.println("Bullet Type: " + type +
                " Position: (" + x + "," + y + "," + z + ")" +
                " Speed: " + speed +
                " User: " + userId);
    }
}