// public class Main {
//     public static void main(String[] args) {
//         Vehicle v = new Vehicle("M12", "T", "XL", 2.5, "moto");
//         System.out.println(v.getbrand());
//         System.out.println(v.getvehicleINumberplate());
//         System.out.println(v.getvehicleType());
//         System.out.println(v.getmodel());
//         System.out.println(v.isAvalible());


        
//     }
    
// }

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("M12", "Toyota", "Hilux", 50.0, "Car");
        Customer c = new Customer("C001", "John Doe", "012345678");
        Staff s = new Staff("Alice", "S99", 10101, "098765432");

        
        if (v.isAvalible()) {
            v.rent(); 
            Rental r = new Rental(v, c, 3, 5001); 
            System.out.println("--- Rental Receipt ---");
            System.out.println("Customer: " + c.getname());
            System.out.println("Vehicle: " + v.getvehicleINumberplate());
            System.out.println("Total Cost: $" + v.calulatePrice(r.getdays()));
            System.out.println("Total Days :" + r.getdays());
            System.out.println("Status: Vehicle is now rented.");
            System.out.println("Staff info :" + s.getnameStaff() );
        } else {
            System.out.println("Sorry, this vehicle is not available.");
        }
    }
}