package Day_06_Singleton_DP_04;

public class B_SingleTon_01 {
    // Step 1: private static instance
    private static B_SingleTon_01 instance;

    // Step 2: private constructor
    private B_SingleTon_01() {
        System.out.println("Singleton object created");
    }

    // Step 3: public static method to access instance
    public static B_SingleTon_01 getInstance() {
        if (instance == null) {
            instance = new B_SingleTon_01(); // created only once
        }
        return instance;
    }
}
