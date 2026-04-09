package Day_09_Factory_DP_006;

public class TaxApplication {

    private TaxAlgorithm algorithm;
    private TaxReportGenerator report;

    public TaxApplication(TaxFactory factory) {
        this.algorithm = factory.createTaxAlgorithm();
        this.report = factory.createReportGenerator();
    }

    public void process(SalaryDetails salaryDetails) {

        double tax = algorithm.calculateTax(salaryDetails);

        report.generateReport(tax);
    }
}