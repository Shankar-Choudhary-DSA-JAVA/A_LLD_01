package Day_09_Factory_DP_002;
//* Registration-Based Factory
//Registration-based factory uses a Map of suppliers to dynamically create objects, eliminating switch-case and making the system fully OCP-compliant.
//| Principle | Status |
//| --------- | ------ |
//| SRP       | ✅      |
//| OCP       | ✅🔥    |
//| DIP       | ✅      |
//| LSP       | ✅      |
public class Main {

    public static void main(String[] args) {

        // Register all DBs
        DatabaseFactory.register("MYSQL", MySqlDb::new);
        DatabaseFactory.register("POSTGRES", PostgresDb::new);
        DatabaseFactory.register("MONGO", MongoDb::new);

        // Use
        Database db1 = DatabaseFactory.getDatabase("MYSQL");
        db1.connect();

        Database db2 = DatabaseFactory.getDatabase("POSTGRES");
        db2.connect();
    }
}

//M1 :-
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Register objects
//        DatabaseFactory.register("MYSQL", new MySqlDb());
//        DatabaseFactory.register("POSTGRES", new PostgresDb());
//
//        // Get object
//        Database db = DatabaseFactory.getDatabase("MYSQL");
//        db.connect();
//    }
//}

//M2 :-
//public class Main {
//
//    public static void main(String[] args) {
//
//        // Register class (not object)
//        DatabaseFactory.register("MYSQL", MySqlDb.class);
//        DatabaseFactory.register("POSTGRES", PostgresDb.class);
//
//        Database db1 = DatabaseFactory.getDatabase("MYSQL");
//        db1.connect();
//
//        Database db2 = DatabaseFactory.getDatabase("POSTGRES");
//        db2.connect();
//    }
//}