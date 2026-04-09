package Day_09_Factory_DP_0002;

public class MySqlQueryExecutor implements QueryExecutor {
    public void executeQuery(String query) {
        System.out.println("Executing MySQL Query: " + query);
    }
}