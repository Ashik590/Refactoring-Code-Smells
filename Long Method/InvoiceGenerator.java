public class InvoiceGenerator {
    private Order order;

    InvoiceGenerator(Order order) {
        this.order = order;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    public double getDiscount(double total) {
        return total * 0.1;
    }

    public double getTax(double total) {
        return total * 0.2;
    }

    public void printItems() {
        System.out.println("Items:");
        for (Item item : order.getItems()) {
            System.out.println(item.getName() + ": " + item.getPrice());
        }

    }

    public double getFinalAmount(double total, double discount, double tax) {
        return total - discount + tax;
    }

    public void generateInvoice() {
        double total = getTotal();
        double discount = getDiscount(total);
        double tax = getTax(total);

        double finalAmount = getFinalAmount(total, discount, tax);

        System.out.println("Invoice for Order ID: " + order.getId());

        printItems();

        System.out.println("Total: " + total);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Amount: " + finalAmount);
    }
}
