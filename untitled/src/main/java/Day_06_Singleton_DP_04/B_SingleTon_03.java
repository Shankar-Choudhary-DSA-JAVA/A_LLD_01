package Day_06_Singleton_DP_04;

public class B_SingleTon_03 {
    //Eager

    private static final B_SingleTon_03 instance = new B_SingleTon_03();

    private B_SingleTon_03() {
    }

    public static B_SingleTon_03 getInstance() {
        return instance;
    }
}
