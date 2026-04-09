package Day_10_Structural_Adapter_DP_02;

// RazorPayAdapter.java
public class RazorPayAdapter implements PaymentGateway {

    private RazorPay razorPay = new RazorPay();

    @Override
    public long payViaCreditCard(String cardNumber, int cvv, String expiryDate) {

        String txnId = razorPay.payViaCreditCard(
                cardNumber,
                expiryDate,
                String.valueOf(cvv)
        );

        return txnId.hashCode();
    }

    @Override
    public PaymentStatus getPaymentStatus(long transactionId) {

        String status = razorPay.checkPaymentStatus(String.valueOf(transactionId));

        // Convert String → Enum
        if ("SUCCESS".equalsIgnoreCase(status)) {
            return PaymentStatus.SUCCESS;
        } else if ("FAILED".equalsIgnoreCase(status)) {
            return PaymentStatus.FAILED;
        } else {
            return PaymentStatus.PENDING;
        }
    }
}