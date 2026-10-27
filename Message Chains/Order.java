public class Order {
    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerZipCode(){
        return customer.getZipCode();
    }
}
