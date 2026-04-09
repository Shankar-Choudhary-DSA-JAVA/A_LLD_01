package Day_09_Factory_DP_0002;

public class MySqlTransactionManager implements TransactionManager {
    public void begin() {
        System.out.println("MySQL Transaction Started");
    }
    public void commit() {
        System.out.println("MySQL Transaction Committed");
    }
}