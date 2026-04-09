package Day_09_Factory_DP_02;

public class EmailService {

    public void sendEmail(DatabaseFactory factory) {

        Database db = factory.createDatabase();

        db.connect();
        db.getUsers();

        System.out.println("Sending Email...");
    }
}