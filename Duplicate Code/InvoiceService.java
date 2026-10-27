public class InvoiceService {
    public void printInvoice(Order order) {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }
        double tax = total * 0.2;
        System.out.println("Invoice Total: " + (total + tax));
    }
}
