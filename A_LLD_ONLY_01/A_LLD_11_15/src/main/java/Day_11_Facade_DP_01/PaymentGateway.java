package Day_11_Facade_DP_01;

class PaymentGateway {
    public void processPayment() {
        System.out.println("Payment processed");
    }
}

class InventoryService {
    public void updateStock() {
        System.out.println("Stock updated");
    }
}

class EmailService {
    public void sendEmail() {
        System.out.println("Email sent to customer");
    }
}

class AnalyticsService {
    public void logOrder() {
        System.out.println("Order logged for analytics");
    }
}