package Day_06_Singleton_DP_04;

public class B_SingleTon_02 {
    private static B_SingleTon_02 instance;

    private B_SingleTon_02() {}

    public static synchronized B_SingleTon_02 getInstance() {
        if (instance == null) {
            instance = new B_SingleTon_02();
        }
        return instance;

    }
}
