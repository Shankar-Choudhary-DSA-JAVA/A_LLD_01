package Day_02_c_OOPS_03_Inheri_Const_Chaining;

public class A1 {
    private int a;

    private int b;

    A1(){
        System.out.println("A default Constructor");
this.a=4;
this.b=5;
    }
    A1(String name) {
        System.out.println("A Para Constructor " + name);

    }
}