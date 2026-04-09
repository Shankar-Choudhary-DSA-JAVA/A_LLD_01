package Day_11_FlyWeight_DP_03;
//🔥 5. Flyweight Factory (Registry Pattern)
import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static final Map<BulletType, Bullet> cache = new HashMap<>();

    public static Bullet getBullet(BulletType type) {

        if (cache.containsKey(type)) {
            return cache.get(type);
        }

        System.out.println("Creating new Bullet of type: " + type);

        Bullet bullet = new Bullet(
                type,
                "Red",
                new byte[1024] // 1KB image
        );

        cache.put(type, bullet);// register bullet
        return bullet;

    }
}