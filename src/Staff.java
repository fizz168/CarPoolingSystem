 public class Staff {
    private String nameStaff;
    private String staffId;
    private int staffPersonalId;
    private String staffPhoneNumber;

public Staff(String nameStaff, String staffId, int staffPersonalId, String staffPhoneNumber) {
        this.nameStaff = nameStaff;
        this.staffId = staffId;
        this.staffPersonalId = staffPersonalId;
        this.staffPhoneNumber = staffPhoneNumber;
    }
public String getNameStaff(){
    return nameStaff;
}
public String getStaffId(){
    return staffId;
}
public int getStaffPersonalId(){
    return staffPersonalId;
}
public String getStaffPhoneNumber(){
    return staffPhoneNumber;
}
}
