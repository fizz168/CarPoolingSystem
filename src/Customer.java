class Customer {
    private String customerPersonalId;
    private String name;
    private String phoneNumber;
public Customer(String customerPersonalId, String name, String phoneNumber){
    this.customerPersonalId = customerPersonalId;
    this.name = name;
    this.phoneNumber = phoneNumber;
}
public String getcustomerPersonalId(){
    return customerPersonalId;
}
public String getname(){
    return name;
}
public String getphoneNumber(){
    return phoneNumber;
}
}
