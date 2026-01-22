class Vehicle{
    private String carId;
    private String motoId;
    private String brand;
    private String model;
    private double pricePerDay;
    private Boolean isAvalible;

public Vehicle (String carId, String motoID, String brand, String model, double pricePerDay ){
    this.carId = carId;
    this.motoId = motoID;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.isAvalible = true;

}
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
