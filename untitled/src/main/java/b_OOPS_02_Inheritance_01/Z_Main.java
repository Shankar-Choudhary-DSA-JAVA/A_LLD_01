package b_OOPS_02_Inheritance_01;

public class Z_Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor();
        //  instructor.name = "Shankar";
        //instructor.description = "Super Cool";

        instructor.setName("Shankar");
        instructor.getName();
        instructor.setDescription("SuperCool");
        instructor.getDescription();
        instructor.saySomething();


        A_User user = new A_User();
      //  user.name = "Nitu";
user.setName("Nitu");
        Mentor mentor = new Mentor();
//        mentor.name = "Shankar";
//        mentor.email = "shankar@gmail.com";
//        mentor.description = "Boss";

        mentor.setName("naman");
        mentor.setEmail("shankar@gmail.com");
        mentor.setDescription("Boss");

    }
}
