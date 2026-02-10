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
    // double calulatePrice(int rentalDay) {
    //     return pricePerDay * rentalDay;
    // }

    // boolean isAvalible() {
    //     return isAvalible;
    // }

    // void rent() {
    //     isAvalible = false;
    // }

    // void returnCar() {
    //     isAvalible = true;
    // }
}
