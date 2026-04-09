package Day_03_d_OOPS_PolyMorphism_04;

import java.util.List;

public class Main_03 {
    public static void changePasswordOfAllUsers(List<User> users) {
        for (User user : users) {
            user.changeEmail();
            System.out.println(user);
        }
    }

    public static void main(String[] args) {
        System.out.println("Starts..");

        User u = new TA();
        User u1 = new Student();
        User u2 = new Mentor();
        User u3 = new User();
       // u3.changeEmail();

        List<User> users = List.of(u1, u, u2, u3,
                new Student(),
                new TA(),
                new Mentor(),
                new User()
        );
        Main_03.changePasswordOfAllUsers(users);

    }
}
