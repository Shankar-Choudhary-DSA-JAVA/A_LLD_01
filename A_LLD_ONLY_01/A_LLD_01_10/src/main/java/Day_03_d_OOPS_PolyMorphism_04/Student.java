package Day_03_d_OOPS_PolyMorphism_04;

public class Student extends  User{
    String batch;
    double psp;
    Mentor mentor;

    void changeMentor(){

    }
    void changeBatch(){
        System.out.println("Batch Changes..");
    }
    void changeEmail(){
        System.out.println("Changes email");
    }
}
