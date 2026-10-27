import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;

    Order(ArrayList<Item> items){
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }
}
