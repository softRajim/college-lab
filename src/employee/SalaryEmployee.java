package employee;

/**
 * @author rajimalimiya
 * @created 19/09/2023 - 07:49
 * @project StudentProject
 **/
public class SalaryEmployee extends Employee {

    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double totalSalary() {
        return this.monthlySalary;
    }

    public Employee getSalaryEmployee() {
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        salaryEmployee.setFullName("AAA");
        salaryEmployee.setEmployeeId(1);
        salaryEmployee.setContact("9849428100");
        salaryEmployee.setMonthlySalary(20000);
        return salaryEmployee;
    }
}
