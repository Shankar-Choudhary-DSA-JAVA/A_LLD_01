package Day_09_Factory_DP_002;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DatabaseFactory {

    // Map to store DB creators
    private static final Map<String, Supplier<Database>> registry = new HashMap<>();

    // Register method
    public static void register(String type, Supplier<Database> supplier) {
        registry.put(type, supplier);
    }

    // Get DB
    public static Database getDatabase(String type) {

        Supplier<Database> supplier = registry.get(type);

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid DB Type");
        }

        return supplier.get();
    }
}

//M1
//import java.util.HashMap;
//        import java.util.Map;
//
//public class DatabaseFactory {
//
//    // Store actual objects
//    private static final Map<String, Database> registry = new HashMap<>();
//
//    // Register object
//    public static void register(String type, Database db) {
//        registry.put(type, db);
//    }
//
//    // Get object
//    public static Database getDatabase(String type) {
//
//        Database db = registry.get(type);
//
//        if (db == null) {
//            throw new IllegalArgumentException("Invalid DB Type");
//        }
//
//        return db;
//    }
//}

//M2 :-

//import java.util.HashMap;
//        import java.util.Map;
//
//public class DatabaseFactory {
//
//    // Store class types
//    private static final Map<String, Class<? extends Database>> registry = new HashMap<>();
//
//    // Register class
//    public static void register(String type, Class<? extends Database> clazz) {
//        registry.put(type, clazz);
//    }
//
//    // Create object
//    public static Database getDatabase(String type) {
//
//        Class<? extends Database> clazz = registry.get(type);
//
//        if (clazz == null) {
//            throw new IllegalArgumentException("Invalid DB Type");
//        }
//
//        try {
//            return clazz.getDeclaredConstructor().newInstance(); // create object
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
