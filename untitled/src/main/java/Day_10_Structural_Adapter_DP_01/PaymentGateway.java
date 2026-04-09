package Day_10_Structural_Adapter_DP_01;

// PaymentGateway.java
public interface PaymentGateway {

    long payViaCreditCard(String cardNumber, int cvv, String expiryDate);

    String getPaymentStatus(long transactionId);
}