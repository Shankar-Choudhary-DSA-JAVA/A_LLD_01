package Day_09_Factory_DP_06;

public class TaxCalculator {

    public static double calculateTax(String regime, SalaryDetails salaryDetails) {

        TaxAlgorithm algorithm = TaxCalculatorFactory.getAlgorithm(regime);

        return algorithm.calculateTax(salaryDetails);
    }
}