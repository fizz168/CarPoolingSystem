 public class Rental {

    private Vehicle vehicle;
    private Customer customer;
    private int days;
    private int recordId;
    private double priceAtBooking;

public Rental(Vehicle vehicle, Customer customer, int days, int recordId) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.recordId = recordId;
        this.priceAtBooking = vehicle.getPricePerDay();
    }
public Vehicle getVehicle(){
    return vehicle;
}
public Customer getCustomer(){
    return customer;
}
public int getDays(){
    return days;
}
public int getRecordId(){
    return recordId;
}
public double getPriceAtBooking(){
    return priceAtBooking;
}
}
