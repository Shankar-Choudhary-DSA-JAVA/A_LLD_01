package Day_09_Factory_DP_006;

public class OldTaxFactory implements TaxFactory {

    @Override
    public TaxAlgorithm createTaxAlgorithm() {
        return new OldTaxRegime();
    }

    @Override
    public TaxReportGenerator createReportGenerator() {
        return new OldTaxReport();
    }
}