public class OrderProcessor {

    boolean isEmpty(Order order){
        return order.getItems().size() == 0;
    }
    
    double getTotal(Order order){
        double total = 0;
        for (Item item : order.getItems()) {
            total += item.getPrice();
        }

        return total;
    }

    double calculateTax(double total, double taxRate){
        return total * taxRate;
    }

    public void processOrder(Order order) {
        if (isEmpty(order)) {
            System.out.println("Order is empty");
            return;
        }

        double total = getTotal(order);
        double tax = calculateTax(total, 0.2);

        System.out.println("Total with tax: " + (total + tax));
    }
}
