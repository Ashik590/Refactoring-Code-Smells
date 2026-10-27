public abstract class Order {
    private String customerName;
    private String orderDetails;

    Order(String customerName, String orderDetails){
        this.customerName = customerName;
        this.orderDetails = orderDetails;
    }

    public abstract void processPayment(double amount);
}
