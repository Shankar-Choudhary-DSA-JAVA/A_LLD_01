package Day_04_Abstraction_SOLID_Principles_01;

import java.util.List;

public class Main_01 {
    public static void changePasswordOfAllUsers(List<User> users) {
        for (User user : users) {
            user.changeEmail();
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starts..");
        //  User u3 = new User();
        User u1 = new Student();
        // u3.changeEmail();

//        List<User> users = List.of(u1,u3,
//                new Student(),
//                new User()
//        );
        List<User> users = List.of(u1,
                new Student()
        );
        Main_01.changePasswordOfAllUsers(users);
        u1.saySomething();
        User u2 = new Mentor();
        u2.saySomething();

        User u4 = new Student("Hi");

    }
}
