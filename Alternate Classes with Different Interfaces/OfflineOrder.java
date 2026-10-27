public class OfflineOrder extends Order {

    OfflineOrder(String customerName, String orderDetails) {
        super(customerName, orderDetails);
    }

    public void processPayment(double amount) {
        System.out.println("Processing offline payment of amount: " + amount);
    }
}
