package Day_09_Factory_DP_002;

public class MySqlDb implements Database {

    public void connect() {
        System.out.println("Connecting to MySQL");
    }

    public void getUsers() {
        System.out.println("Users from MySQL");
    }
}