package Day_09_Factory_DP_006;

public class NewTaxReport implements TaxReportGenerator {

    @Override
    public void generateReport(double tax) {
        System.out.println("New Regime Tax Report: " + tax);
    }
}