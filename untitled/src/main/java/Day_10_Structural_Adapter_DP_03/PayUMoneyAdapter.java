package Day_10_Structural_Adapter_DP_03;

import Day_10_Structural_Adapter_DP_03.payUMoney.PayUMoney;

// PayUMoneyAdapter.java
public class PayUMoneyAdapter implements PaymentGateway {

    private PayUMoney payUMoney = new PayUMoney();

    @Override
    public long payViaCreditCard(String cardNumber, int cvv, String expiryDate) {

        return payUMoney.payByCreditCard(
                Long.parseLong(cardNumber),
                Integer.parseInt(expiryDate.replaceAll("-", "")),
                String.valueOf(cvv),
                "User"
        );
    }

    @Override
    public PaymentStatus getPaymentStatus(long transactionId) {

        String status = payUMoney.getStatus(transactionId);

        // Convert String → Enum
        switch (status.toUpperCase()) {
            case "SUCCESS":
                return PaymentStatus.SUCCESS;
            case "FAILED":
                return PaymentStatus.FAILED;
            default:
                return PaymentStatus.PENDING;
        }
    }
}