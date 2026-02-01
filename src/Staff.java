public class Staff {
    String nameStaff;
    String staffId;
    int staffPersonalId;
    String staffPhoneNumber;
public Staff(String nameStaff, String staffId, int staffPersonalId, String staffPhoneNumber){
    this.nameStaff = nameStaff;
    this.staffId = staffId;
    this.staffPersonalId = staffPersonalId;
    this.staffPhoneNumber = staffPhoneNumber;

}
public String getnameStaff(){
    return nameStaff;
}
public String getstaffId(){
    return staffId;
}
  public int getstaffPersonalId(){
    return staffPersonalId;
  }  
public String getstaffPhoneNumber(){
    return staffPhoneNumber;
}

}
