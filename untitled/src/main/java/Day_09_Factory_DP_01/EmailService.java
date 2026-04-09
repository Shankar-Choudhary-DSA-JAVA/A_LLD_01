package Day_09_Factory_DP_01;

public class EmailService {

    public void sendEmail(DbType type) {

        Database db = DatabaseFactory.getDatabase(type);

        db.connect();
        db.getUsers();

        System.out.println("Sending email...");
    }
}