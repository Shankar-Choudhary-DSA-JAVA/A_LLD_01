package Day_09_Factory_DP_02;
// Simple Factory DP implementations :-
//✔ Removed if-else from business logic
//✔ Followed SRP (creation moved to factory)
//✔ OCP better (only factory changes)
//✔ Cleaner + reusable

//# Here above code follows :-
//* DRY :- Don't repeat Yourself :- Ok
//* Removed if-else from business logic :- OK
//* Maintainable :- Ok
//* Followed SRP (creation moved to factory) :- OK
//* Cleaner + reusable :- OK
//** OCP better (only factory changes):- OK
//* Code should be open for extension, closed for modification

public class Main_Client {
    public static void main(String[] args) {


        // 🔥 Register all DBs at startup
        DatabaseFactory.register("MYSQL", MySqlDb::new);
        DatabaseFactory.register("POSTGRES", PostgresDb::new);
       // DatabaseFactory.register("CASSANDRA", CassandraDb::new);

        // Now use anywhere
        EmailService service = new EmailService();
        service.sendEmail(DbType.valueOf("MYSQL"));
    }
    }
