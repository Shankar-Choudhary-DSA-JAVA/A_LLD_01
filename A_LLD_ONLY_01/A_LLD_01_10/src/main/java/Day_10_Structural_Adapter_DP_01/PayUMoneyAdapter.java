package Day_10_Structural_Adapter_DP_01;

// PayUMoneyAdapter.java
public class PayUMoneyAdapter implements PaymentGateway {

    private PayUMoney payUMoney = new PayUMoney();

    @Override
    public long payViaCreditCard(String cardNumber, int cvv, String expiryDate) {

        long cardNo = Long.parseLong(cardNumber);
        int exp = Integer.parseInt(expiryDate.replaceAll("-", ""));

        return payUMoney.payByCreditCard(cardNo, exp, String.valueOf(cvv), "User");
    }

    @Override
    public String getPaymentStatus(long transactionId) {
        return payUMoney.getStatus(transactionId);
    }
}