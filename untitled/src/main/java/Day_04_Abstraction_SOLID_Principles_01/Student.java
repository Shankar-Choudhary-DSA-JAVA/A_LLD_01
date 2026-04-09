package Day_04_Abstraction_SOLID_Principles_01;


public class Student extends User {
    String batch;
    double psp;

    Student(){

    }
    Student(String userType) {
        super("Student");
    }

    void changeMentor() {

    }

    void changeBatch() {
        System.out.println("Batch Changes..");
    }

    @Override
    void saySomething() {
        System.out.println("Hi Bro");
    }

    void changeEmail() {
        System.out.println("Changes email");
    }
}
