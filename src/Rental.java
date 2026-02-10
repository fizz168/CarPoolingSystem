 class Rental {

    Vehicle vehicle;
    Customer customer;
    int days;
    int recordId;
    double priceAtBooking;

  Rental(Vehicle vehicle, Customer customer, int days, int recordId) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.days = days;
        this.recordId = recordId;
        this.priceAtBooking = vehicle.getPricePerDay();
    }
}
