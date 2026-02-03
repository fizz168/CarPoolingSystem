
class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("M12", "Toyota", "Hilux", 50.0, "Car");
        Customer c = new Customer("C001", "John Doe", "012345678", "male");
        Staff s = new Staff("Alice", "S99", 10101, "098765432");

        if (v.isAvalible()) {
            v.rent();
            Rental r = new Rental(v, c, 3, 5001);

            System.out.println("--- Rental Receipt ---");
            System.out.println("Customer: " + c.name);
            System.out.println("Phone number :" + c.phoneNumber);
            System.out.println("Vehicle: " + v.vehicleNumberPlate);
            System.out.println("Total Cost: $" + v.calulatePrice(r.days));
            System.out.println("Total Days :" + r.days);
            System.out.println("Status: Vehicle is now rented.");
            System.out.println("Staff info :" + s.nameStaff);

        } else {
            System.out.println("Sorry, this vehicle is not available.");
        }
    }
}
