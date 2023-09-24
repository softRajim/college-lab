package employee;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 07:53
 * @project StudentProject
 **/
public class BasicPLusCommissionEmployee extends CommissionEmployee {
    private double basicSalary;
    @Override
    public double totalSalary() {
        return this.basicSalary + super.totalSalary();
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
}
