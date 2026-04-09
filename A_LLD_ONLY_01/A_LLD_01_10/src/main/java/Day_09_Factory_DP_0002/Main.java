package Day_09_Factory_DP_0002;
//Use it when:
//        You have multiple related objects (families)
//        Not just one object like Database
//        But a group of objects that must work together

//🧠 SOLID Principles
//
//✔ SRP → Each class has one job
//✔ OCP → Add new DB family without modifying existing
//✔ DIP → Depends on interfaces
//✔ LSP → Substitutable implementations

//Abstract Factory provides an interface to create families of related objects without specifying their concrete classes.

public class Main {

    public static void main(String[] args) {

        DatabaseFactory factory = new MySqlFactory(); // or PostgresFactory

        Application app = new Application(factory);
        app.run();
    }
}