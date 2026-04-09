package Day_09_Factory_DP_006;

public interface TaxFactory {

    TaxAlgorithm createTaxAlgorithm();

    TaxReportGenerator createReportGenerator();
}