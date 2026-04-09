package Day_11_FlyWeight_DP_00;

public class Player {

    private long id;
    private String name;
    private Gun gun;

    public Player(long id, String name) {
        this.id = id;
        this.name = name;
        this.gun = new Gun();
    }

    public void shoot(Bullet bullet) {
        gun.fireBullet(bullet);
    }

    public Gun getGun() {
        return gun;
    }
}