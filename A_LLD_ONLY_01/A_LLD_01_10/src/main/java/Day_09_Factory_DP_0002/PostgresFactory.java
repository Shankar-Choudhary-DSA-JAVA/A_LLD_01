package Day_09_Factory_DP_0002;

public class PostgresFactory implements DatabaseFactory {

    public Database createDatabase() {
        return new PostgresDb();
    }

    public QueryExecutor createQueryExecutor() {
        return new PostgresQueryExecutor();
    }

    public TransactionManager createTransactionManager() {
        return new PostgresTransactionManager();
    }
}