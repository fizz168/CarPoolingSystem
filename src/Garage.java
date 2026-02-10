public class Garage {
    private String garageName;
    private Vehicle[] inventory;
    private int vehicleCount;
public Garage(String garageName, int capacity){
    this.garageName = garageName;
    this.inventory = new Vehicle[capacity];
    this.vehicleCount = 0;
}
public String getGarageName(){
    return garageName;
}
public void addVehicle(Vehicle v){
    if(vehicleCount < inventory.length){
    inventory[vehicleCount] = v;
    vehicleCount++;
}
}
public Vehicle findVehicle(String plateFound){
    for(int i = 0; i < vehicleCount; i++){
        if(inventory[i].getVehicleNumberPlate().equals(plateFound)){
            return inventory[i] ;
        }
    }
    return null;

}
}
