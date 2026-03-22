package Day_06_Singleton_DP_02;

public class A_Singleton_01 {

    //Eager loading
    private static final A_Singleton_01 instance = new A_Singleton_01();

    private A_Singleton_01(){
    }

    // Create instance below :-
    public static A_Singleton_01 getInstance(){
        return instance;
    }

}
