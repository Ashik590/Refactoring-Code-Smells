public class Main {
    public static void main(String[] args) {
        Order order1 = new OnlineOrder("Ashik", "Something");
        Order order2 = new OfflineOrder("Ashik", "Something");

        order1.processPayment(100);
        order2.processPayment(200);
    }
}
