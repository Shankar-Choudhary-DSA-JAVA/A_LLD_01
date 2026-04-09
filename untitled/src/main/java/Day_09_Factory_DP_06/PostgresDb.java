package Day_09_Factory_DP_06;

public class PostgresDb extends Database {

    public PostgresDb(String host, int port) {
        super(host, port);
    }

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}