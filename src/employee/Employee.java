package employee;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 07:48
 * @project StudentProject
 **/
public abstract class Employee {

    private String fullName;
    private int employeeId;
    private String contact;

    public abstract double totalSalary();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
