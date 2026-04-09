package Day_10_Structural_Adapter_DP_02;

// Flipkart.java
public class Flipkart {

    private PaymentGateway paymentGateway;

    // DI via constructors
    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String makeCreditCardPayment(String cardNumber, int cvv, String expiryDate) {

        long txnId = paymentGateway.payViaCreditCard(cardNumber, cvv, expiryDate);

        PaymentStatus status = paymentGateway.getPaymentStatus(txnId);

        if (status == PaymentStatus.SUCCESS) {
            return "Payment Successful";
        } else if (status == PaymentStatus.FAILED) {
            return "Payment Failed";
        } else {
            return "Payment Pending";
        }
    }
}