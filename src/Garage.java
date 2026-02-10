public class Garage {
    private String garageName;
    private Vehicle[] inventory;
    private int vehicleCount;
    private static double taxRate = 0.10;
public Garage(String garageName, int capacity){
    this.garageName = garageName;
    this.inventory = new Vehicle[capacity];
    this.vehicleCount = 0;
    taxRate ++;
}
public static double getTaxRate(){
    return taxRate;
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
public Vehicle getVehicleAt(int index){
    if(index >= 0 && index < vehicleCount){
        return inventory[index];
    }
    return null;

}
}
