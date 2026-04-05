package Day_09_Factory_DP_05;

//How this class violates SRP :-
// 1. It calculates tax
// 2. It switches between regimes
// It is also not maintainable

// SRP told methods or class should do one thing at a time or one responsibility
public class TaxCalculator {

    public static Double calculateTax(TaxRegime regime, SalaryDetails salaryDetails) {

//        if (regime == TaxRegime.OLD)
//            return new OldTaxReime().caluclateTax(salaryDetails);

        return TaxCalculatorFactory
                .getTaxAlgorithm(regime)
                .caluclateTax(salaryDetails);
        //👉 “Why are we NOT using new in TaxCalculator?”
        //
        //🧠 Short Answer
        //
        //👉 Because object creation responsibility is moved to the Factory, not the TaxCalculator
    }
}