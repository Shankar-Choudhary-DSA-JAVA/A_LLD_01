package Day_11_FlyWeight_DP_01;

// FlyingBullet.java
public class FlyingBullet {

    // Changing attributes
    private double x, y, z;
    private double dx, dy, dz;
    private double speed;
    private int status;
    private long userId;

    // Reference (only 8 bytes)
    private IntrinsicBullet bullet;

    public FlyingBullet(double x, double y, double z,
                         double dx, double dy, double dz,
                         double speed,
                         int status,
                         long userId,
                         IntrinsicBullet bullet) {

        this.x = x;
        this.y = y;
        this.z = z;

        this.dx = dx;
        this.dy = dy;
        this.dz = dz;

        this.speed = speed;
        this.status = status;
        this.userId = userId;

        this.bullet = bullet;
    }

    public void display() {
        System.out.println("User: " + userId + 
                           " fired bullet type: " + bullet.getType());
    }

    public byte[] getImage() {
        return bullet.getImage(); // reuse shared image
    }
}