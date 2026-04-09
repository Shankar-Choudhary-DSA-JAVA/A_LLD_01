package Day_09_Factory_DP_02;
// Factory Method :-
public class Main {

    public static void main(String[] args) {

        EmailService service = new EmailService();

        DatabaseFactory factory = new MySqlFactory();  // choose at runtime
        service.sendEmail(factory);

        factory = new PostgresFactory();
        service.sendEmail(factory);
    }
}

//    Factory Method removes switch-case by delegating object creation to subclasses (factories), making system fully OCP compliant.
//        | Principle | Status |
//        | --------- | ------ |
//        | SRP       | ✅      |
//        | OCP       | ✅🔥    |
//        | DIP       | ✅      |
//        | LSP       | ✅      |

//| Feature         | Simple Factory          | Factory Method           |
//        | --------------- | ----------------------- | ------------------------ |
//        | Object creation | One class (switch-case) | Multiple factory classes |
//        | OCP             | ❌ Violates              | ✅ Follows                |
//        | Scalability     | Low                     | High                     |
//        | Flexibility     | Medium                  | High                     |
