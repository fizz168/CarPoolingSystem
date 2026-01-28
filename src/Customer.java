public class Customer {
     String customerId;
     String name;
     int phoneNumbe;
public Customer(String customerId, String name, int phoneNumber){
    this.customerId = customerId;
    this.name = name;
    this.phoneNumbe = phoneNumber;
}
public String getcustomerId(){
    return customerId;
}
public String getname(){
    return name;
}
public int getphoneNumber(){
    return phoneNumbe;
}
}
