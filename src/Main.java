
public class Main {
    public static void main(String[] args) {
        Garage g = new Garage("CADT Auto", 10);

        Vehicle v = new Vehicle("M12", "Pagani", "Huayra Roadster BC", 500.00, "Car");
        g.addVehicle(v);
        Customer c = new Customer("C001", "Nhean Omra", "098733402", "male");
        Staff s = new Staff("Lim Vinchay", "S99", 10101, "098765432");
        Rental r = new Rental(v, c, 3, 5001);
            System.out.println("--- Rental Receipt ---");
            System.out.println("Customer: " + c.name);
            System.out.println("Phone number :" + c.phoneNumber);
            System.out.println("Vehicle: " + v.vehicleNumberPlate);
            System.out.println("Total Days :" + r.days);
            System.out.println("Status: Vehicle is now rented.");
            System.out.println("Staff info :" + s.nameStaff);
            System.out.println("Price per day:" + v.pricePerDay);
            System.out.println("brand: " + v.brand);
            System.out.println("model: " + v.model);
    System.out.println("-----------------------------");
        double originalPrice = v.pricePerDay;
        double copyPrice = originalPrice;
        copyPrice = 6.7;
        System.out.println("Original price :" + originalPrice);
        System.out.println("Prize copy :" + copyPrice);

        Vehicle vR = v;
        vR.brand = "Mercedes";
        System.out.println("Original Brand :" + v.brand);
        System.out.println("Copy Brand :" + vR.brand);

        System.out.println("Price in system: " + g.inventory[0].pricePerDay);

        v.pricePerDay = 6.9;
        System.out.println("Vehicle prize Change to : " + v.pricePerDay);
        System.out.println("Vehicle original prize :" + r.priceAtBooking);

        Vehicle found = g.findVehicle("Non Existent");
        if(found == null){
            System.out.println("Vehicle is not found");
        } 
    }
}
