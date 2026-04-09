package Day_09_Factory_DP_02;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class DatabaseFactory {

    private static final Map<String, Supplier<Database>> registry = new HashMap<>();

    public static void register(String type, Supplier<Database> dbSupplier) {
        registry.put(type, dbSupplier);
    }

    public static Database getDatabase(String type) {
        return registry.get(type).get();
    }
}