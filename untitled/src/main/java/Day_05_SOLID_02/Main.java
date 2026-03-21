package Day_05_SOLID_02;

public class Main {

    // 1️⃣ Behaviour Interface
    interface FlyingBehaviour {
        void difffly();
    }

    // 2️⃣ Concrete Behaviour Classes
    static class PigeonSparrowFlyingBehaviour implements FlyingBehaviour {
        public void difffly() {
            System.out.println("Pigeon/Sparrow flying style");
        }
    }

    static class CrowSparrowFlyingBehaviour implements FlyingBehaviour {
        public void difffly() {
            System.out.println("Crow flying style");
        }
    }

    // 3️⃣ Flying Interface
    interface Flying {
        void fly();
    }

    // 4️⃣ Abstract Bird Class
    static abstract class Bird implements Flying {
        FlyingBehaviour fb; // HAS-A relationship

        Bird(FlyingBehaviour fb) { // Dependency Injection
            this.fb = fb;
        }
    }

    // 5️⃣ Concrete Class
    static class Pigeon extends Bird {

        Pigeon(FlyingBehaviour fb) {
            super(fb);
        }

        public void fly() {
            fb.difffly(); // delegation
        }
    }

    // 6️⃣ Main Method
    public static void main(String[] args) {

        FlyingBehaviour behaviour = new PigeonSparrowFlyingBehaviour();

        Bird pigeon = new Pigeon(behaviour);
        pigeon.fly();

        // Change behaviour at runtime
        pigeon.fb = new CrowSparrowFlyingBehaviour();
        pigeon.fly();
    }
}