package Day_01_a_OOPS_01_Encapsulations;

public class A_Student_02_Main {
    public static void main(String[] args) {
        System.out.println("Hello_01");
        A_Student_01 Sonu = new A_Student_01();//Obj creation using Constructors

        Sonu.name="Sonu";
        Sonu.age = 23;
        Sonu.address="Jhalaun";
       // Sonu.mobile = 9006228897L;
        Sonu.changeBatch("CS_Batch");

//        Sonu.changeMobile();
        System.out.println(Sonu.changeMobile());
        System.out.println("Hello_02");

    }
}
