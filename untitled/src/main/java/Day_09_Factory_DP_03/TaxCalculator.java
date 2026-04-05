package Day_09_Factory_DP_03;

//How this class violates SRP :-
// 1. It calculates tax
// 2. It switches between regimes
// It is also not maintainable

// SRP told methods or class should do one thing at a time or one responsibility
public class TaxCalculator {

    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails){

        switch (regime) {
            case OLD:
                return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra();

            case NEW:
                return 0.4 * salaryDetails.getBasePay() + 0.3 * salaryDetails.getHra() + 0.2*salaryDetails.getLta();
//Never use default case, give proper return type
        }
        throw new RuntimeException("Invalid Regime: " +regime);
    }
}
