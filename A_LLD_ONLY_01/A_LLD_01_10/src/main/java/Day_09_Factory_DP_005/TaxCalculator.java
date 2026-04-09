package Day_09_Factory_DP_005;

public class TaxCalculator {

    public static double calculateTax(TaxFactory factory, SalaryDetails salaryDetails) {

        TaxAlgorithm algorithm = factory.createTaxAlgorithm();

        return algorithm.calculateTax(salaryDetails);
    }
}