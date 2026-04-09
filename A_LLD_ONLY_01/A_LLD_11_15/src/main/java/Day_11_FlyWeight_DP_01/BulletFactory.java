package Day_11_FlyWeight_DP_01;// BulletFactory.java
import java.util.HashMap;
import java.util.Map;

public class BulletFactory {

    private static final Map<Integer, IntrinsicBullet> bulletMap = new HashMap<>();

    public static IntrinsicBullet getBullet(int type) {

        // If already exists → reuse
        if (bulletMap.containsKey(type)) {
            System.out.println("Reusing existing bullet of type: " + type);
            return bulletMap.get(type);
        }

        // Else create new bullet
        System.out.println("Creating new bullet of type: " + type);

        double radius = type * 1.0;
        double weight = type * 2.0;
        byte[] image = new byte[1024]; // 1KB image

        IntrinsicBullet bullet = new IntrinsicBullet(radius, weight, type, image);

        bulletMap.put(type, bullet);

        return bullet;
    }
}