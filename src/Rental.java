class Rental {
   private Vehicle vehicle;
   private Customer customer;
   private int days;

   public Rental(Vehicle vehicle, Customer customer, int days) {
      this.vehicle = vehicle;
      this.customer = customer;
      this.days = days;
   }

   public Vehicle getvehicle() {
      return this.vehicle;
   }

   public Customer getcustomer() {
      return this.customer;
   }

   public int getdays() {
      return this.days;
   }
}