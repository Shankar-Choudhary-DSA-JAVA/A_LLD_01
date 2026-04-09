package Day_09_Factory_DP_0002;
//3️⃣ “Without specifying concrete classes”
public class Application {

    private Database db;
    private QueryExecutor executor;
    private TransactionManager txManager;

    public Application(DatabaseFactory factory) {
        this.db = factory.createDatabase();
        this.executor = factory.createQueryExecutor();
        this.txManager = factory.createTransactionManager();
    }

    public void run() {
        db.connect();
        txManager.begin();
        executor.executeQuery("SELECT * FROM users");
        txManager.commit();
    }
}