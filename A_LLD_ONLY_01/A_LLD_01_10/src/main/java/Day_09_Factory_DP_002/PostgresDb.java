package Day_09_Factory_DP_002;

public class PostgresDb implements Database {

    public void connect() {
        System.out.println("Connecting to Postgres");
    }

    public void getUsers() {
        System.out.println("Users from Postgres");
    }
}