package Day_11_FlyWeight_DP_00;

import java.util.ArrayList;
import java.util.List;

public class Gun {

    private List<Bullet> bullets = new ArrayList<>();

    public void fireBullet(Bullet bullet) {
        bullets.add(bullet);
        System.out.println("Bullet fired!");
    }

    public List<Bullet> getBullets() {
        return bullets;
    }
}