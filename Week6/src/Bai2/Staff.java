package Bai2;

public class Staff {
    private String staffId;
    private String staffName;
    private int staffAge;
    private String staffEmail;
    private String staffPhoneNumber;

    public Staff(String staffId, String staffName,int staffAge, String staffEmail, String staffPhoneNumber ) {
        this.staffId = staffId;
        this.staffName = staffName;
        this.staffAge = staffAge;
        this.staffEmail = staffEmail;
        this.staffPhoneNumber = staffPhoneNumber;
    }

    public Staff() {
    }

    public double calculateSalary() {
        return 0.0;
    }


    @Override
    public String toString() {
        return " Mã nhân viên: " + staffId  + '\n' +
                " Tên: " + staffName + '\n' +
                " Tuổi: " + staffAge + '\n' +
                " Email: " + staffEmail + '\n' +
                " SĐT: " + staffPhoneNumber + '\n';
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffEmail() {
        return staffEmail;
    }

    public void setStaffEmail(String staffEmail) {
        this.staffEmail = staffEmail;
    }

    public String getStaffPhoneNumber() {
        return staffPhoneNumber;
    }

    public void setStaffPhoneNumber(String staffPhoneNumber) {
        this.staffPhoneNumber = staffPhoneNumber;
    }
}
