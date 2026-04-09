package Day_06_Singleton_DP_04;

public class B_SingleTon_07 {
    //🔹 5. Bill Pugh Singleton (🔥 Best Practice)
    private B_SingleTon_07() {}

    private static class Helper {
        private static final B_SingleTon_07 INSTANCE = new B_SingleTon_07();
    }

    public static B_SingleTon_07 getInstance() {
        return Helper.INSTANCE;
    }
        
    

}
