public class Customer {
     String customerId;
     String name;
     int phoneNumber;
public Customer(String customerId, String name, int phoneNumber){
    this.customerId = customerId;
    this.name = name;
    this.phoneNumber = phoneNumber;
}
public String getcustomerId(){
    return customerId;
}
public String getname(){
    return name;
}
public int getphoneNumber(){
    return phoneNumber;
}
}
