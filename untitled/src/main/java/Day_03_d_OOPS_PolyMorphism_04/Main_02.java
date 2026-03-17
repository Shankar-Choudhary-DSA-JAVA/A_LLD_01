package Day_03_d_OOPS_PolyMorphism_04;

import java.util.List;

public class Main_02 {

    public static void changePasswordOfAllUsers(List<User> users) {
        for (User user : users) {
            user.changeEmail();
            System.out.println(user);

            if (user instanceof Student) {
                System.out.println("I am Student");
                Student s = (Student) user;
                s.changeBatch();
            }

            if (user instanceof Mentor) {
                System.out.println("I am mentor");
                Mentor m = (Mentor) user;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Starts..");

        User u = new TA();
        User u1 = new Student();
        User u2 = new Mentor();
        User u3 = new User();

        // u3.desc;
        // TA t = (TA) u3; // downcasting //ClassCastException

        TA t = (TA) u; // correct downcasting
        //User up = t; // Upcasting

        u1.email = "abc@gmail.com";
        System.out.println(u1);// not works

        System.out.println(u1.email);
        System.out.println(u1.email = "abc@gmail.com");
        String e = u1.email = "abc@gmail.com";
        System.out.println(e);


        List<User> users = List.of(u1, u, u2, u3,
                new Student(),
                new TA(),
                new Mentor(),
                new User()
        );
        System.out.println("*********");

        System.out.println(users);
        System.out.println("*********");

        for (User l : users) {
            System.out.println(l);
        }
        System.out.println("Methods :-*********");

        changePasswordOfAllUsers(users);
        System.out.println("End..");

        u3.changeEmail();

    }
}
