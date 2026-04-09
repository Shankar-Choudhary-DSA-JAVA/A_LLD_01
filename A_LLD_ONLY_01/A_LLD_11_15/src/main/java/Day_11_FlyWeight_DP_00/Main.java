package Day_11_FlyWeight_DP_00;
// Without Flyweight DP :_
// “In this design, each Bullet object stores both intrinsic and extrinsic data, leading to high memory usage due to duplication of heavy fields like image. This becomes inefficient at scale, which is why Flyweight Pattern is introduced to optimize memory by sharing intrinsic data.”

public class Main {

    public static void main(String[] args) {

        Player player = new Player(101, "Player1");

        // simulate firing 2000 bullets
        for (int i = 0; i < 2000; i++) {

            Bullet bullet = new Bullet(
                    5.5,
                    10,
                    "Red",
                    new byte[1024], // 1KB image per object ❌
                    BulletType.MM_5_5,
                    10, 20, 30,
                    1, 1, 1,
                    100,
                    BulletStatus.FIRED,
                    player.getGun().hashCode()
            );

            player.shoot(bullet);
        }

        System.out.println("Total bullets fired: " +
                player.getGun().getBullets().size());
    }
}