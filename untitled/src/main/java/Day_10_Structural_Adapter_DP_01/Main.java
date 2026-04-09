package Day_10_Structural_Adapter_DP_01;

public class Main {
    public static void main(String[] args) {

        // 🔁 Switch here easily (NO CHANGE in Flipkart class)

        //PaymentGateway pg = new RazorPayAdapter();
        PaymentGateway pg = new PayUMoneyAdapter();

        Flipkart flipkart = new Flipkart(pg);

        String result = flipkart.makeCreditCardPayment(
                "1234567890123456",
                123,
                "12-26"
        );

        System.out.println(result);
    }
}