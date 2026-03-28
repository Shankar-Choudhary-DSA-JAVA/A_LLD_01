package Day_06_Singleton_DP_04;

public class B_SingleTon_06 {
//🔹 4. Double-Checked Locking (🔥 Most Asked in Interviews)

        private static volatile B_SingleTon_06 instance;

        private B_SingleTon_06() {}
//“We use Singleton.class because static methods don’t have this,
// //and we need a class-level lock since the instance is static and shared across all threads.”
        public static B_SingleTon_06 getInstance() {
            if (instance == null) {              // First check
                synchronized (B_SingleTon_06.class) {
                    if (instance == null) {      // Second check
                        instance = new B_SingleTon_06();
                    }
                }
            }
            return instance;

    
    }
}
