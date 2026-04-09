package Day_11_FlyWeight_DP_01;// Main.java
import java.util.ArrayList;
import java.util.List;
// FlyWeight DP
public class Main {

    public static void main(String[] args) {

        List<FlyingBullet> bullets = new ArrayList<>();

        // 100 users
        for (int user = 1; user <= 100; user++) {

            // each fires 2000 bullets
            for (int i = 0; i < 2000; i++) {

                // only 20 types
                int type = (i % 20) + 1;

                // Get shared object
                IntrinsicBullet intrinsicBullet = BulletFactory.getBullet(type);

                // Create lightweight object
                FlyingBullet flyingBullet = new FlyingBullet(
                        Math.random() * 100,
                        Math.random() * 100,
                        Math.random() * 100,
                        1, 1, 1,
                        50,
                        1,
                        user,
                        intrinsicBullet
                );

                bullets.add(flyingBullet);
            }
        }

        // Display few bullets
        bullets.stream().limit(10).forEach(FlyingBullet::display);
    }
}