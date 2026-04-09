package Day_11_FlyWeight_DP_03;

public class FlyingBullet {

    private double x, y, z;
    private double directionX, directionY, directionZ;
    private double speed;
    private BulletStatus status;
    private long userId;

    private Bullet bullet; // Flyweight reference

    public FlyingBullet(double x, double y, double z,
                        double directionX, double directionY, double directionZ,
                        double speed, BulletStatus status,
                        long userId, Bullet bullet) {

        this.x = x;
        this.y = y;
        this.z = z;
        this.directionX = directionX;
        this.directionY = directionY;
        this.directionZ = directionZ;
        this.speed = speed;
        this.status = status;
        this.userId = userId;
        this.bullet = bullet;
    }

    public void display() {
        System.out.println(
                "Type: " + bullet.getType() +
                " | Status: " + status +
                " | Position: (" + x + "," + y + "," + z + ")" +
                " | User: " + userId
        );
    }
}