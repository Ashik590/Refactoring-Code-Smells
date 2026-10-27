public class OnlineOrder extends Order {

    OnlineOrder(String customerName, String orderDetails){
        super(customerName, orderDetails);
    }

    public void processPayment(double amount) {
        System.out.println("Processing online payment of amount: " + amount);
    }
}