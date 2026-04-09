package Day_11_FlyWeight_DP_02;

public class FlyingBullet {

    // Extrinsic (changing)
    private double x, y, z;
    private double dx, dy, dz;
    private double speed;
    private BulletStatus status;
    private long userId;

    // Reference to Flyweight
    private IntrinsicBullet intrinsicBullet;

    public FlyingBullet(double x, double y, double z,
                        double dx, double dy, double dz,
                        double speed,
                        BulletStatus status,
                        long userId,
                        IntrinsicBullet intrinsicBullet) {

        this.x = x;
        this.y = y;
        this.z = z;

        this.dx = dx;
        this.dy = dy;
        this.dz = dz;

        this.speed = speed;
        this.status = status;
        this.userId = userId;

        this.intrinsicBullet = intrinsicBullet;
    }

    public void display() {
        intrinsicBullet.display();
        System.out.println("Position: (" + x + "," + y + "," + z + "), Speed: " + speed);
    }
}