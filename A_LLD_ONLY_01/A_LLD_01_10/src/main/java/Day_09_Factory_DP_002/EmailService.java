package Day_09_Factory_DP_002;

public class EmailService {

    public void sendEmail(String dbType) {

        Database db = DatabaseFactory.getDatabase(dbType);

        db.connect();
        db.getUsers();

        System.out.println("Sending Email...");
    }
}