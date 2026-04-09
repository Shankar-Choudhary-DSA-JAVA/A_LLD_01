package Day_06_Singleton_DP_01;

public class Z_Main_01 {
    public static void main(String[] args) {
       // A_Singleton_01 obj = new A_Singleton_01();

       A_Singleton_01.getInstance();

       A_Singleton_01 obj1 = A_Singleton_01.getInstance();
       A_Singleton_01 obj2 = A_Singleton_01.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj1==obj2);
        System.out.println(obj1.equals(obj2));

        RandomClass randomClass = new RandomClass();



    }
}
