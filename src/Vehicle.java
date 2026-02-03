class Vehicle {

    String vehicleNumberPlate;
    String brand;
    String model;
    double pricePerDay;
    boolean isAvalible;
    String vehicleType;

    Vehicle(String vehicleNumberPlate, String brand, String model, double pricePerDay, String vehicleType) {
        this.vehicleNumberPlate = vehicleNumberPlate;
        this.brand = brand;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvalible = true;
        this.vehicleType = vehicleType;
    }

    double calulatePrice(int rentalDay) {
        return pricePerDay * rentalDay;
    }

    boolean isAvalible() {
        return isAvalible;
    }

    void rent() {
        isAvalible = false;
    }

    void returnCar() {
        isAvalible = true;
    }
}
