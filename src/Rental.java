class Rental {
   private Vehicle vehicle;
   private Customer customer;
   private int days;
   private int recordId;

   public Rental(Vehicle vehicle, Customer customer, int days, int recordId) {
      this.vehicle = vehicle;
      this.customer = customer;
      this.days = days;
      this.recordId = recordId;
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
   public int getrecordid(){
      return recordId;
   }
  
   }
