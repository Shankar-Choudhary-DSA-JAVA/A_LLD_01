package Day_06_Singleton_DP_04;

public class B_SingleTon_04 {
    //Lazy

    private static B_SingleTon_04 instance;

    private B_SingleTon_04() {
    }

    public static B_SingleTon_04 getInstance() {
        if (instance == null) {
            instance = new B_SingleTon_04();
        }
        return instance;
    }
}
