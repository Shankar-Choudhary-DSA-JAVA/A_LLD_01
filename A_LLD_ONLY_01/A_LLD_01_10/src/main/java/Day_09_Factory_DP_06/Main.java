package Day_09_Factory_DP_06;
//Registration-Based Factory
public class Main {

    public static void main(String[] args) {

        // Register all regimes
        TaxCalculatorFactory.register("OLD", OldTaxRegime::new);
        TaxCalculatorFactory.register("NEW", NewTaxRegime::new);

        SalaryDetails salaryDetails =
                new SalaryDetails(100000.0, 50000.0, 25000.0);

        // Get correct implementation
        TaxAlgorithm algo = TaxCalculatorFactory.getAlgorithm("OLD");

        double tax = algo.calculateTax(salaryDetails);

        System.out.println("Tax: " + tax);
    }
}