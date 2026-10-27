import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        OrderProcessor op = new OrderProcessor();

        ArrayList<Item> items = new ArrayList<>();

        Item item1 = new Item(12);
        Item item2 = new Item(15);
        Item item3 = new Item(20);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        Order order = new Order(items);

        op.processOrder(order);
    }
}
