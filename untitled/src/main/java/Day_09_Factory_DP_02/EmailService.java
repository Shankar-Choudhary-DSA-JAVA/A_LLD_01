package Day_09_Factory_DP_02;

public class EmailService {

    public void sendEmail(DbType type) {

        Database db = DatabaseFactory.getDatabase(String.valueOf(type));

        db.connect();
        db.getUsers();

        System.out.println("Sending email...");
    }
}