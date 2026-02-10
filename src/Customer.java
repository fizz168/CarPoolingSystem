 public class Customer {
    private String customerPersonalId;
    private String customerName;
    private String customerPhoneNumber;
    private String gender;
    private boolean isMember;

 public Customer(String customerPersonalId, String customerName, String customerPhonenumber, String gender) {
        this.customerPersonalId = customerPersonalId;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhonenumber;
        this.gender = gender;   
        this.isMember = false;
    }
public String getCustomerPersonalId(){
    return customerPersonalId;
}
public String getCustomerName(){
    return customerName;
}
public String getCustomerPhoneNumber(){
    return customerPhoneNumber;
}
public String getGender(){
    return gender;
}
public boolean isMember(){
    return isMember;
}

}
