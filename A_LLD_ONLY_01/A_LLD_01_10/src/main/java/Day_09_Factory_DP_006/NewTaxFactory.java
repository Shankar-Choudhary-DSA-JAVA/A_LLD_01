package Day_09_Factory_DP_006;

public class NewTaxFactory implements TaxFactory {

    @Override
    public TaxAlgorithm createTaxAlgorithm() {
        return new NewTaxRegime();
    }

    @Override
    public TaxReportGenerator createReportGenerator() {
        return new NewTaxReport();
    }
}