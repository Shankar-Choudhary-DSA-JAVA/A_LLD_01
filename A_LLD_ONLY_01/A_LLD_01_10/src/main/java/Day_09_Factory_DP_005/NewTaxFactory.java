package Day_09_Factory_DP_005;

public class NewTaxFactory implements TaxFactory {

    @Override
    public TaxAlgorithm createTaxAlgorithm() {
        return new NewTaxRegime();
    }
}