package Day_09_Factory_DP_006;
//Abstract Factory
public class Main {

    public static void main(String[] args) {

        SalaryDetails salaryDetails =
                new SalaryDetails(100000.0, 50000.0, 25000.0);

        TaxFactory factory = new OldTaxFactory(); // or NewTaxFactory

        TaxApplication app = new TaxApplication(factory);

        app.process(salaryDetails);
    }
}