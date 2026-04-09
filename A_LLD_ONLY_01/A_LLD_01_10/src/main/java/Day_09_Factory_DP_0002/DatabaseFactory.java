package Day_09_Factory_DP_0002;
//1️⃣ “Provides an interface”
public interface DatabaseFactory {

    Database createDatabase();
    QueryExecutor createQueryExecutor();
    TransactionManager createTransactionManager();
}