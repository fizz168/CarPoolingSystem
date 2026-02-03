public class Garage {
    String systemName;
    Vehicle[] inventory;
    int vehicleCount;
public Garage(String systemName, int capacity){
    this.systemName = systemName;
    this.inventory = new Vehicle[capacity];
    this.vehicleCount = 0;
}
public void addVehicle(Vehicle v){
    inventory[vehicleCount] = v;
    vehicleCount++;
}
public Vehicle findVehicle(String plateFound){
    for(int i = 0; i < vehicleCount; i++){
        if(inventory[i].vehicleNumberPlate.equals(plateFound)){
            return inventory[i] ;
        }
    }
    return null;

}
}
