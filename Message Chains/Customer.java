public class Customer {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getZipCode(){
        return address.getZipCode();
    }
}