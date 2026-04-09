package Day_11_FlyWeight_DP_04;

import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static final Map<BulletType, Bullet> cache = new HashMap<>();

    public static Bullet getBullet(BulletType type) {

        // 🔥 Debug: Check reuse
        if (cache.containsKey(type)) {
            System.out.println("♻️ Reusing Bullet of type: " + type);
            return cache.get(type);
        }
        // 🔥 Create only once per type
        System.out.println("🆕 Creating new Bullet of type: " + type);

        Bullet bullet = new Bullet(
                type,
                "Red",
                new byte[1024] // 1KB image
        );

        cache.put(type, bullet);
        return bullet;
    }

    // 🔥 Debug helper
    public static int getCacheSize() {
        return cache.size();
    }
}