class Rental {
    private Vehicle car;
    private Vehicle moto;
    private Customer customer;
    private int days;

public Rental(Vehicle car, Vehicle moto, Customer customer, int days ){
        this.car = car;
        this.moto = moto;
        this.customer = customer;
        this.days = days;
    }
public Vehicle getcar(){
    return car;
}
public Vehicle getmoto(){
    return moto;
}
public Customer getcustomer(){
    return customer;
}
public int getdays(){
    return days;
}
}
