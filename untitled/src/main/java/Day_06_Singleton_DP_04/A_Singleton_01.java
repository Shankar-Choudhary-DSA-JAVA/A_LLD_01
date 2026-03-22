package Day_06_Singleton_DP_04;

public class A_Singleton_01 {

  private static volatile A_Singleton_01 instance = null;
// private static final A_Singleton_01 instance = null;

    // private constructor
    private A_Singleton_01() {
    }

    public static A_Singleton_01 getInstance() {

        if (instance == null) { // 1st check

            synchronized (A_Singleton_01.class) { // fix here

                if (instance == null) { // 2nd check
                    instance = new A_Singleton_01();
                }
            }
        }
        return instance;
    }
}