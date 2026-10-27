public class InvoicePrinter {
    public void printInvoice(Invoice invoice) {
        System.out.println("Subtotal: " + invoice.getSubTotal());
        System.out.println("Tax: " + invoice.getTax());
        System.out.println("Total: " + invoice.getTotal());
    }
}
