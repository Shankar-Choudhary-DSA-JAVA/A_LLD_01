package Day_04_Abstraction_SOLID_Principles_01;

public class Mentor extends User {
String company;
String desc;
int rating;

void removeMentee(){

}

    @Override
    void saySomething() {
        System.out.println("Hello from Mentor");
    }

    void changeEmail(){
        System.out.println("Changes email");
    }
}
