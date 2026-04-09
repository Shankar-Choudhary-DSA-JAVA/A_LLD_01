package Day_03_d_OOPS_PolyMorphism_04;

class Parent {

    int x = 10;

    void show() {
        System.out.println("Parent show()");
    }
}

class Child extends Parent {

    int x = 20;

    void show() {
        System.out.println("Child show()");
    }
}

public class I_Test_01 {

    public static void main(String[] args) {

        Parent p = new Child();

        System.out.println(p.x);
        p.show();
    }
}