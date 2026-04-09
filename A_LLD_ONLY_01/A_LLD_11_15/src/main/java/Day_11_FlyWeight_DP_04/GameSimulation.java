package Day_11_FlyWeight_DP_04;
//👉 Only 3 Bullet objects created
//👉 1000 times reused via reference
//
//🎯 Interview Killer Line
//
//“I verified Flyweight by logging object creation in the factory and checking cache size, which confirmed only unique intrinsic objects were created.”
import java.util.ArrayList;
import java.util.List;

public class GameSimulation {

    public static void main(String[] args) {

        List<FlyingBullet> flyingBullets = new ArrayList<>();

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

            flyingBullets.add(fb);
        }

        System.out.println("\n🎯 Total Flying Bullets: " + flyingBullets.size());
        System.out.println("🎯 Total Unique Bullet Objects (Flyweight): " + BulletFactory.getCacheSize());
    }
}