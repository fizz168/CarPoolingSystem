class Customer {
    private String customerPersonalId;
    private String name;
    private int phoneNumber;
public Customer(String customerPersonalId, String name, int phoneNumber){
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
public int getphoneNumber(){
    return phoneNumber;
}
}
