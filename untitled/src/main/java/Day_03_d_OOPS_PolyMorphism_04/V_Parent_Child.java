package Day_03_d_OOPS_PolyMorphism_04;


class A1 {

    public void doSomething(String name) {
        System.out.println("hi");
    }

}

class B1 extends A1 {
    @Override
    public void doSomething(String name) {
        System.out.println("hi2");
        //infinite loops
//        super.doSomething("Hi");
//        this.doSomething("Hi");
    }
}

public class V_Parent_Child {
    public static void main(String[] args) {

        A1 a = new A1();
        a.doSomething("Hello");

        B1 b = new B1();
        b.doSomething("Hello");

        A1 a2 = new B1();
        a2.doSomething("Hi");

      //  B1 b2 = new A1();//not allowed

    }


}
