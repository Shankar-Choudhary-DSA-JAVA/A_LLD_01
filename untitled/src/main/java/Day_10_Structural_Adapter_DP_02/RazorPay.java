package Day_10_Structural_Adapter_DP_02;

// RazorPay.java
public class RazorPay {

    public String payViaCreditCard(String cardNumber, String expDate, String cvv) {
        System.out.println("RazorPay: Processing payment...");
        return "TXN12345";
    }

    public String checkPaymentStatus(String transactionId) {
        return "SUCCESS";
    }
}