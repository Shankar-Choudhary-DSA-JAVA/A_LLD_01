package Day_11_Facade_DP_01;

class Flipkart {

    private OrderService orderService;

    public Flipkart() {
        this.orderService = new OrderFacade(); // only one dependency
    }

    public void buyNow() {
        orderService.placeOrder();
    }
}