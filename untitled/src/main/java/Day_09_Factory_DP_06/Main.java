package Day_09_Factory_DP_06;
//Factory method
//Follows OCP
//Violates SRPs
// Follows LSP
public class Main {

    public static void main(String[] args) {

        Database db1 = new MySqlDb("localhost", 3306);
        Query q1 = db1.createQuery();
        q1.execute();

        System.out.println("-----");

        Database db2 = new PostgresDb("localhost", 5432);
        Query q2 = db2.createQuery();
        q2.execute();
    }
}