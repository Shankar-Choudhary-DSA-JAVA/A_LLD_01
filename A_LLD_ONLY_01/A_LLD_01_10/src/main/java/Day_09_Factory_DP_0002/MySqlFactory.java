package Day_09_Factory_DP_0002;

public class MySqlFactory implements DatabaseFactory {

    public Database createDatabase() {
        return new MySqlDb();
    }

    public QueryExecutor createQueryExecutor() {
        return new MySqlQueryExecutor();
    }

    public TransactionManager createTransactionManager() {
        return new MySqlTransactionManager();
    }
}