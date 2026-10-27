public class Customer {
    private String firstName;
    private String lastName;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // business logics
    String fullNameFormat() {
        return firstName + lastName;
    }

    boolean hasValidName() {
        return (firstName.length() > 0 && lastName.length() > 0);
    }
}
