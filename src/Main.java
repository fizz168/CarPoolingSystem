
// public class Main {
//     public static void main(String[] args) {
//         Garage g = new Garage("CADT Auto", 10);

//         Vehicle v = new Vehicle("M12", "Pagani", "Huayra Roadster BC", 500.00, "Car");
//         g.addVehicle(v);
//         Customer c = new Customer("C001", "Nhean Omra", "098733402", "male");
//         Staff s = new Staff("Lim Vinchay", "S99", 10101, "098765432");
//         Rental r = new Rental(v, c, 3, 5001);
//             System.out.println("--- Rental Receipt ---");
//             System.out.println("Customer: " + c.getCustomerName());
//             System.out.println("Phone number : " + c.getCustomerPhoneNumber());
//             System.out.println("Vehicle: " + v.getVehicleNumberPlate());
//             System.out.println("Total Days : " + r.getDays());
//             System.out.println("Status: Vehicle is now rented.");
//             System.out.println("Staff info : " + s.getNameStaff());
//             System.out.println("Price per day :" + v.getPricePerDay());
//             System.out.println("brand: " + v.getBrand());
//             System.out.println("model: " + v.getModel());
//     System.out.println("-----------------------------");
//         double originalPrice = v.getPricePerDay();
//         double copyPrice = originalPrice;
//         copyPrice = 6.7;
//         System.out.println("Original price: " + originalPrice);
//         System.out.println("Prize copy: " + copyPrice);

//         Vehicle vR = v;
//         vR.setPricePerDay(50.5);
//         System.out.println("Original price: " + v.getPricePerDay());
//         System.out.println("Copy price: " + vR.getPricePerDay());

//         System.out.println("Price in system: " + g.getVehicleAt(0).getPricePerDay());

//         v.setPricePerDay(100.5);
//         System.out.println("Vehicle prize Change to: " + v.getPricePerDay());
//         System.out.println("Vehicle original prize: " + r.getPriceAtBooking());

//         Vehicle found = g.findVehicle("Non Existent");
//         if(found == null){
//             System.out.println("Vehicle is not found");
//         } 
//     }
// }
