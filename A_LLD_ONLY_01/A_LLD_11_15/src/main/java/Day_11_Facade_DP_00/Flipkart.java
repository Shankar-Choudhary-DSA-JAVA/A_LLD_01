package Day_11_Facade_DP_00;

class Flipkart {

    PaymentGateway pg = new PaymentGateway();
    InventoryService ims = new InventoryService();
    EmailService es = new EmailService();
    AnalyticsService as = new AnalyticsService();

    public void placeOrder() {
        pg.processPayment();
        ims.updateStock();
        es.sendEmail();
        as.logOrder();
    }
}