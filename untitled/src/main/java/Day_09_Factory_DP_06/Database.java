package Day_09_Factory_DP_06;

public abstract class Database {

    protected String host;
    protected int port;

    public Database(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void connect() {
        System.out.println("Connecting to DB at " + host + ":" + port);
    }

    public void terminate() {
        System.out.println("Terminating DB connection");
    }

    // ⭐ Factory Method
    public abstract Query createQuery();
}