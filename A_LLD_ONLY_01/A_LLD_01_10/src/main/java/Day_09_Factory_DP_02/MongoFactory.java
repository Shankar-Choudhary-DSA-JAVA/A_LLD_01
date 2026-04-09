package Day_09_Factory_DP_02;

public class MongoFactory implements DatabaseFactory {

    @Override
    public Database createDatabase() {
        return new MongoDb();
    }
}