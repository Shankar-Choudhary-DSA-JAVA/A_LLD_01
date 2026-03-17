package Day_04_Abstraction_SOLID_Principles_01;

public abstract class User {
    String email;
    String password;
    int mobile;
    private String userType;

    abstract void saySomething();

    User(String userType) {
        this.userType = userType;
    }

    User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    void changeEmail() {

        System.out.println("Changes email");
    }


}
