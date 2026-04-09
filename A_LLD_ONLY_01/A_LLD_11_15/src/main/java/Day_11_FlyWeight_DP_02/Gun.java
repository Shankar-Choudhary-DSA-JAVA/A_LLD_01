package Day_11_FlyWeight_DP_02;

import java.util.ArrayList;
import java.util.List;

public class Gun {

    private List<FlyingBullet> bullets = new ArrayList<>();

    public void fireBullet(FlyingBullet bullet) {
        bullets.add(bullet);
    }

    public List<FlyingBullet> getBullets() {
        return bullets;
    }
}