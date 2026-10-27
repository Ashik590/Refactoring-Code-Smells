public class OrderHelper {
    public void applyDiscount(Order order, double rate) {
        order.setDiscount(order.getTotal() * rate);
    }
}