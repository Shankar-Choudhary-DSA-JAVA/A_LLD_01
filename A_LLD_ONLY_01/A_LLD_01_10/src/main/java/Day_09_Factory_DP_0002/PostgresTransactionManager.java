package Day_09_Factory_DP_0002;

public class PostgresTransactionManager implements TransactionManager {
    public void begin() {
        System.out.println("Postgres Transaction Started");
    }
    public void commit() {
        System.out.println("Postgres Transaction Committed");
    }
}