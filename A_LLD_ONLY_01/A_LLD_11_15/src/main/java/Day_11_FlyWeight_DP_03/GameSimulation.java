package Day_11_FlyWeight_DP_03;
// “In Flyweight, I use enum to represent intrinsic states like BulletType and extrinsic states like BulletStatus to ensure type safety, readability, and maintainability while reducing memory using shared objects.”
import java.util.ArrayList;
import java.util.List;

public class GameSimulation {

    public static void main(String[] args) {

        List<FlyingBullet> bullets = new ArrayList<>();//bullet registry

        BulletType[] types = BulletType.values();

        for (int i = 0; i < 1000; i++) {

            BulletType type = types[i % types.length];

            Bullet sharedBullet = BulletFactory.getBullet(type);

            FlyingBullet fb = new FlyingBullet(
                    Math.random() * 100,
                    Math.random() * 100,
                    Math.random() * 100,
                    1, 1, 1,
                    50,
                    BulletStatus.IN_AIR,
                    1001L,
                    sharedBullet
            );

            bullets.add(fb);
        }
        System.out.println("Total Flying Bullets: " + bullets.size());
    }
}