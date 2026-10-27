import java.util.List;

public class Order {
    private String customerName;
    private List<Item> items;

    Order(String customerName, List<Item> items) {
        this.customerName = customerName;
        this.items = items;
    }
}
