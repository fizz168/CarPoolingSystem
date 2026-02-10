 public class Vehicle {

    private String vehicleNumberPlate;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean isAvalible;
    private String vehicleType;
    private static int totalVehicle = 0;

 public Vehicle(String vehicleNumberPlate, String brand, String model, double pricePerDay, String vehicleType) {
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvalible = true;
        this.vehicleType = vehicleType;
        totalVehicle++;
    }
public Vehicle(String vehicleNumberPlate, String brand, String model){
    this.vehicleNumberPlate = vehicleNumberPlate;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = 25.00;
    this.isAvalible = false;
    this.vehicleType = "general";
}
public String getVehicleNumberPlate(){
    return vehicleNumberPlate;
}
public static int getTotalVehicle(){
    return totalVehicle;
}
public String getBrand(){
    return brand;
}
public void setPricePerDay(double price){
    if(price > 0){
        this.pricePerDay = price;
    }else{
        System.out.println("Error");
    }
}  
public double calulatePrice(int rentalDay) {
      return pricePerDay * rentalDay;
}
public boolean isAvalible() {
        return isAvalible;
}
public double getPricePerDay(){
    return pricePerDay;
}
public void rent() {
    isAvalible = false;
}
public void returnCar() {
    isAvalible = true;
}
public String getModel(){
    return model;
}
public String getVehicleType(){
    return vehicleType;
}

}
