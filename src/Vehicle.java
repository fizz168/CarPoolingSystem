public class Vehicle{
     String vehicleId;
     String brand;
     String model;
     double pricePerDay;
     Boolean isAvalible;
     String vehicletype;
    
public Vehicle (String vehicleId, String brand, String model, double pricePerDay, String vehicletype){
    this.vehicleId = vehicleId;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.isAvalible = true;
    this.vehicletype = vehicletype;
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
public String getvehicletype(){
    return vehicletype;
    
}
}