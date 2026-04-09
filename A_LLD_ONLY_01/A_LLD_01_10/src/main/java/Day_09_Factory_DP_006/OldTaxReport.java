package Day_09_Factory_DP_006;

public class OldTaxReport implements TaxReportGenerator {

    @Override
    public void generateReport(double tax) {
        System.out.println("Old Regime Tax Report: " + tax);
    }
}