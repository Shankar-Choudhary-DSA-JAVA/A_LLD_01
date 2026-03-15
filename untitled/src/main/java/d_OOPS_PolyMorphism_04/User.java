package d_OOPS_PolyMorphism_04;

public class User {
    String email;
    String password;
    int mobile;

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    void changeEmail(){
        System.out.println("Changes email");
    }


}
