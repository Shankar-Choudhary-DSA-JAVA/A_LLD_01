package Day_11_FlyWeight_DP_02;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {
// This is Registry DP we study in Prototype DP
    private static final Map<BulletType, IntrinsicBullet> cache = new HashMap<>();

    public static IntrinsicBullet getBullet(BulletType type) {

        if (!cache.containsKey(type)) {

            byte[] image = new byte[1024]; // heavy object (shared)

            switch (type) {
                case MM_5_5:
                    cache.put(type, new IntrinsicBullet(5.5, 10, image, type));
                    break;
                case MM_7_6:
                    cache.put(type, new IntrinsicBullet(7.6, 15, image, type));
                    break;
                case SNIPER:
                    cache.put(type, new IntrinsicBullet(9.0, 20, image, type));
                    break;
            }

            System.out.println("Creating Intrinsic Bullet: " + type);
        }

        return cache.get(type);
    }
}