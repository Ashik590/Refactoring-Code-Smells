public class Invoice {
    private Item[] items;

    Invoice(Item[] items){
        this.items = items;
    }

    double getSubTotal(){
        double total = 0;

        for(Item item : items)
            total += item.getPrice();

        return total;
    }

    double getTax(){
        return getSubTotal() * 0.2;
    }

    double getTotal(){
        return getSubTotal() + getTax();
    }

    
}
