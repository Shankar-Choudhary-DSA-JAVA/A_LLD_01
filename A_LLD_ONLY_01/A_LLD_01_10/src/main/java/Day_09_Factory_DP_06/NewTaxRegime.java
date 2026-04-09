package Day_09_Factory_DP_06;

public class NewTaxRegime implements TaxAlgorithm {

    @Override
    public double calculateTax(SalaryDetails salaryDetails) {
        return 0.4 * salaryDetails.getBasePay()
             + 0.3 * salaryDetails.getHra()
             + 0.2 * salaryDetails.getLta();
    }
}