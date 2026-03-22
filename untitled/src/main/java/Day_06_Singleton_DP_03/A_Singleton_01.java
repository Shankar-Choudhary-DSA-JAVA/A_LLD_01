package Day_06_Singleton_DP_03;

public class A_Singleton_01 {

    private static  A_Singleton_01 instance = null;

    private A_Singleton_01(){

    }

    // Create instance below :-
    public synchronized static A_Singleton_01 getInstance(){

        if(instance == null){

            instance = new A_Singleton_01();
        }
        return instance;
    }

}
