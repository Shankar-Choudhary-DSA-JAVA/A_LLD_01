package Day_09_Factory_DP_0002;

public class PostgresQueryExecutor implements QueryExecutor {
    public void executeQuery(String query) {
        System.out.println("Executing Postgres Query: " + query);
    }
}