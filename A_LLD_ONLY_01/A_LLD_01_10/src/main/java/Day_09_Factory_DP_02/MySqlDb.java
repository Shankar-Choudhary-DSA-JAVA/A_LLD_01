package Day_09_Factory_DP_02;

public class MySqlDb implements Database {

    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    public void getUsers() {
        System.out.println("Users from MySQL");
    }
}