package Day_10_Structural_Adapter_DP_01;

// RazorPayAdapter.java
public class RazorPayAdapter implements PaymentGateway {

    private RazorPay razorPay = new RazorPay();

    @Override
    public long payViaCreditCard(String cardNumber, int cvv, String expiryDate) {

        // Convert types (Adapter responsibility)
        String cvvStr = String.valueOf(cvv);

        String txnId = razorPay.payViaCreditCard(cardNumber, expiryDate, cvvStr);

        // Convert String → long (dummy conversion)
        return txnId.hashCode();
    }

    @Override
    public String getPaymentStatus(long transactionId) {

        String txnIdStr = String.valueOf(transactionId);

        return razorPay.checkPaymentStatus(txnIdStr);
    }
}