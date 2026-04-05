package Day_09_Factory_DP_04;

//How this class violates SRP :-
// 1. It calculates tax
// 2. It switches between regimes
// It is also not maintainable

// SRP told methods or class should do one thing at a time or one responsibility
public class TaxCalculator {

    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {
        return TaxCalculatorFactory
                .getTaxAlgorithm(regime)
                .caluclateTax(salaryDetails);
    }
}
