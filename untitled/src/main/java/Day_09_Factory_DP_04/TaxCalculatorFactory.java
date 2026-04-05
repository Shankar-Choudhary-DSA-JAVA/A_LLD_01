package Day_09_Factory_DP_04;

public class TaxCalculatorFactory {

    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime){

        switch (regime){
            case OLD:
                return new OldTaxReime();
            case NEW:
                return new NewTaxReime();
        }
         throw  new RuntimeException("Invalid Regime: "+regime);
    }
}
