package Day_09_Factory_DP_05;

// Factory DP
// It follows every SRP
// It violates OCP, if tommorow new Tax regime comes
public class Main {
    public static void main(String[] args) {


    SalaryDetails salaryDetails = new SalaryDetails(100000.0, 50000.0,25000.0);

    double tax = TaxCalculator.calculateTax(
            TaxRegime.OLD,
            salaryDetails
    );

        System.out.println("Tax: " + tax);
    }

}
