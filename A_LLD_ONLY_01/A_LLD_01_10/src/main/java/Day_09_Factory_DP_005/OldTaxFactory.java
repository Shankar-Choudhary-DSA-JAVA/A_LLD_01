package Day_09_Factory_DP_005;

public class OldTaxFactory implements TaxFactory {

    @Override
    public TaxAlgorithm createTaxAlgorithm() {
        return new OldTaxRegime();
    }
}