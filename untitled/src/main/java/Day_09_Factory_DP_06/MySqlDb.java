package Day_09_Factory_DP_06;

public class MySqlDb extends Database {

    public MySqlDb(String host, int port) {
        super(host, port);
    }

    @Override
    public Query createQuery() {
        return new MySqlQuery(); // Factory Method
    }
}