public class Customer {

    String customerPersonalId;
    String name;
    String phoneNumber;
    String gender;
    boolean isMember;

public Customer(String customerPersonalId, String name, String phoneNumber, String gender) {
        this.customerPersonalId = customerPersonalId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;   
        this.isMember = false;
    }
}
