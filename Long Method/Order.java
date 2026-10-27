import java.util.ArrayList;

public class Order {
    private ArrayList<Item> items;
    private String id;

    Order(ArrayList<Item> items){
        this.items = items;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public String getId() {
        return id;
    }
}
