package Day_11_Facade_DP_00;

class OrderFacade implements OrderService {

    private PaymentGateway pg;
    private InventoryService ims;
    private EmailService es;
    private AnalyticsService as;

    public OrderFacade() {
        this.pg = new PaymentGateway();
        this.ims = new InventoryService();
        this.es = new EmailService();
        this.as = new AnalyticsService();
    }

    @Override
    public void placeOrder() {
        System.out.println("Placing Order...");

        pg.processPayment();
        ims.updateStock();
        es.sendEmail();
        as.logOrder();

        System.out.println("Order Completed ✅");
    }
}