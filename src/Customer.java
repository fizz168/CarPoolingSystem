class Customer {
    private String customerPersonalId;
    private String name;
    private String phoneNumber;
    private String gender;
public Customer(String customerPersonalId, String name, String phoneNumber, String gender){
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
public String getgender(){
    return gender;
}
}
