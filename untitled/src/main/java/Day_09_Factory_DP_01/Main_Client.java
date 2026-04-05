package Day_09_Factory_DP_01;
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
//** OCP better (only factory changes):-
//* Code should be open for extension, closed for modification
//   When I have to add new DB we have to modify DatabaseFactory class and EmailService
//   EmailService Follows OCP
//   DatabaseFactory Violates OCP
public class Main_Client {
    public static void main(String[] args) {

        EmailService service = new EmailService();

        service.sendEmail(DbType.MYSQL);
        service.sendEmail(DbType.POSTGRES);
    }
}