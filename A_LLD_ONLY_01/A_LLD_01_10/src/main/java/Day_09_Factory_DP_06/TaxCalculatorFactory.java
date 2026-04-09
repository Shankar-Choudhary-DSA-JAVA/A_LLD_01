package Day_09_Factory_DP_06;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class TaxCalculatorFactory {

    // Store creation logic
    private static final Map<String, Supplier<TaxAlgorithm>> registry = new HashMap<>();

    // Register method
    public static void register(String type, Supplier<TaxAlgorithm> supplier) {
        registry.put(type, supplier);
    }

    // Get algorithm
    public static TaxAlgorithm getAlgorithm(String type) {

        Supplier<TaxAlgorithm> supplier = registry.get(type);

        if (supplier == null) {
            throw new IllegalArgumentException("Invalid Tax Regime: " + type);
        }

        return supplier.get(); // create object
    }
}