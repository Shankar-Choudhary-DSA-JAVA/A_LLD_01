package Day_09_Factory_DP_005;

public class OldTaxRegime implements TaxAlgorithm {

    @Override
    public double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay()
             + 0.3 * salaryDetails.getHra();
    }
}