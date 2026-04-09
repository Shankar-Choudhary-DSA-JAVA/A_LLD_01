package Day_03_d_OOPS_PolyMorphism_04;

class A {

    A() {
        System.out.println("A Constructor");
    }

    A(int x) {
        this();
        System.out.println("A Parameterized Constructor");
    }
}

class B extends A {

    B() {
        super(10);
        System.out.println("B Constructor");
    }

    B(int y) {
        this();
        System.out.println("B Parameterized Constructor");
    }
}

public class I_Test_02 {

    public static void main(String[] args) {

        B obj = new B(5);
    }
}