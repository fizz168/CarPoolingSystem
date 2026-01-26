class Vehicle{
    private String vehicleId;
    private String brand;
    private String model;
    private double pricePerDay;
    private Boolean isAvalible;

public Vehicle (String vehicleId, String brand, String model, double pricePerDay ){
    this.vehicleId = vehicleId;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.isAvalible = true;
}
public String getvehicleId(){
    return vehicleId;
}
public String brand(){
    return brand;
}
public String model(){
    return model;
}
public double calulatePrice(int rentalDay){
    return pricePerDay* rentalDay;
}
public boolean isAvalible(){
    return isAvalible;
}
public void rent(){
  isAvalible = false;
}
public void returnCar(){
    isAvalible = true;
}
    
}
