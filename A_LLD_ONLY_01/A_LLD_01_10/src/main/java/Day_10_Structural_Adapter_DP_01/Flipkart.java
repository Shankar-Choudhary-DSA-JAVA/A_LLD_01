package Day_10_Structural_Adapter_DP_01;

// Flipkart.java
public class Flipkart {

    private PaymentGateway paymentGateway;

    // Dependency Injection
    public Flipkart(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String makeCreditCardPayment(String cardNumber, int cvv, String expiryDate) {

        long txnId = paymentGateway.payViaCreditCard(cardNumber, cvv, expiryDate);

        String status = paymentGateway.getPaymentStatus(txnId);

        if ("SUCCESS".equals(status)) {
            return "Payment Successful";
        } else {
            return "Payment Failed";
        }
    }
}