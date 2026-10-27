// Scenario:
// The `OrderHelper` class accesses and modifies internal fields of the `Order` class directly.
// This makes `OrderHelper` too familiar with the internals of `Order`, violating encapsulation.
//
// Task for Students:
// Refactor the code to reduce coupling by using public methods in `Order` instead of accessing fields directly.
// Apply **Encapsulate Field**, **Move Method**, or **Hide Delegate** as needed.

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Item> items;
    private double discount;

    Order() {
        items = new ArrayList<>();
        discount = 0;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }

        return total;
    }
}
