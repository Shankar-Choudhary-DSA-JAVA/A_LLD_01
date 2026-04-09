package Day_09_Factory_DP_01;

public class DatabaseFactory {

    public static Database getDatabase(DbType type) {

        switch (type) {
            case MYSQL:
                return new MySqlDb();

            case POSTGRES:
                return new PostgresDb();

            case MONGO:
                return new MongoDb();
        }
//            default:
//                throw new IllegalArgumentException("Invalid DB Type");

            // No default, but still safe
            throw new IllegalArgumentException("Unsupported DB type: " + type);
    }
}