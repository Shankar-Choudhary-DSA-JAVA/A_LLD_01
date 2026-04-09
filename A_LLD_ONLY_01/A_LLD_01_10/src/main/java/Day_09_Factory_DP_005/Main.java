package Day_09_Factory_DP_005;
//Factory Method
public class Main {

    public static void main(String[] args) {

        SalaryDetails salaryDetails =
                new SalaryDetails(100000.0, 50000.0, 25000.0);

        // Choose factory
        TaxFactory factory = new OldTaxFactory();

        double tax = TaxCalculator.calculateTax(factory, salaryDetails);

        System.out.println("Tax: " + tax);
    }
}