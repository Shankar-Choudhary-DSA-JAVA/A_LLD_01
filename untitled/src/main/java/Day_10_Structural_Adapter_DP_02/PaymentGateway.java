package Day_10_Structural_Adapter_DP_02;

// PaymentGateway.java
public interface PaymentGateway {

    long payViaCreditCard(String cardNumber, int cvv, String expiryDate);

    PaymentStatus getPaymentStatus(long transactionId);
}