package d_OOPS_PolyMorphism_04;

public class Main_01 {


    public static void main(String[] args) {
        User u = new User();
        User u1 = new Mentor();
        User u2 = new TA();
        User u3 = new Student();
        u1.email="abc@gmail.com";
        System.out.println(u1);// not works

        System.out.println(u1.email);
        System.out.println(u1.email="abc@gmail.com");
        String e = u1.email="abc@gmail.com";
        System.out.println(e);


        System.out.println("End..");
    }
}
