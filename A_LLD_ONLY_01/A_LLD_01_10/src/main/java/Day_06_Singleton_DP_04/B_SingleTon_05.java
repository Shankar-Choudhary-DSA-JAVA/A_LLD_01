package Day_06_Singleton_DP_04;

public class B_SingleTon_05 {
    //Thread safety

    private static B_SingleTon_05 instance;

    private B_SingleTon_05() {}

    public static synchronized B_SingleTon_05 getInstance() {
        if (instance == null) {
            instance = new B_SingleTon_05();
        }
        return instance;

    }
}
