package Day_09_Factory_DP_02;

public class MongoDb implements Database {

    public void connect() {
        System.out.println("Connecting to MongoDB");
    }

    public void getUsers() {
        System.out.println("Users from MongoDB");
    }
}