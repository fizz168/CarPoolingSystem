class Vehicle{
    private String vehicleNumberPlate;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvalible;
    private String vehicleType;
    
public Vehicle (String vehicleNumberPlate, String brand, String model, double pricePerDay, String vehicleType){
    this.vehicleNumberPlate = vehicleNumberPlate;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.isAvalible = true;
    this.vehicleType = vehicleType;
}
public String getvehicleINumberplate(){
    return vehicleNumberPlate;
}
public String getbrand(){
    return brand;
}
public String getmodel(){
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
public String getvehicleType(){
    return vehicleType;
    
}
}