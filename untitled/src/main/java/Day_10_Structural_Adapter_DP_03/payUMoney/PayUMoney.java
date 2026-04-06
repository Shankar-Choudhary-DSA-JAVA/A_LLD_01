package Day_10_Structural_Adapter_DP_03.payUMoney;

// PayUMoney.java
public class PayUMoney {

    public long payByCreditCard(long cardNumber, int expDate, String cvv, String name) {
        System.out.println("PayUMoney: Processing payment...");
        return 987654321L;
    }

    public String getStatus(long transactionId) {
        return "SUCCESS";
    }
}