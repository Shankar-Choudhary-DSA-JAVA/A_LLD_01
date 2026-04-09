package Day_09_Factory_DP_01;

public class PostgresDb implements Database {
    public void connect() {
        System.out.println("Connected to Postgres");
    }

    public void getUsers() {
        System.out.println("Fetching users from Postgres");
    }
}