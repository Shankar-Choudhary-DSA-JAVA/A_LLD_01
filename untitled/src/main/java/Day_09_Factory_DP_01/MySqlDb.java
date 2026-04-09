package Day_09_Factory_DP_01;

public class MySqlDb implements Database {
    public void connect() {
        System.out.println("Connected to MySQL");
    }

    public void getUsers() {
        System.out.println("Fetching users from MySQL");
    }
}