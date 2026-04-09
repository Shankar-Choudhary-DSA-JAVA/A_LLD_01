package Day_11_FlyWeight_DP_02;
// Flyweight DP

// “We used Flyweight Pattern by separating intrinsic and extrinsic state, storing intrinsic objects in a factory, and referencing them inside context objects to drastically reduce memory usage.”

public class Main {

    public static void main(String[] args) {

        Player player = new Player(101, "Player1");

        for (int i = 0; i < 2000; i++) {

            // Get shared object (Flyweight)
            IntrinsicBullet bulletType =
                    BulletFactory.getBullet(BulletType.MM_5_5);

            FlyingBullet bullet = new FlyingBullet(
                    10, 20, 30,
                    1, 1, 1,
                    100,
                    BulletStatus.FIRED,
                    101,
                    bulletType
            );

            player.shoot(bullet);
        }

        System.out.println("Total bullets fired: " +
                player.getGun().getBullets().size());
    }
}